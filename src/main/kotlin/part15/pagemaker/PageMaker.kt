package part15.pagemaker

import java.io.FileWriter

class PageMaker {
    companion object {
        fun makeWelcomePage(mailaddr: String, filename: String) {
            try {
                val mailprop = Database.getProperties("part15")
                val username = mailprop.getProperty(mailaddr)
                val writer = HtmlWriter(FileWriter(filename))
                writer.title("$username's web page")
                writer.paragraph("Welcome to $username's web page!")
                writer.paragraph("Nice to meed you!")
                writer.mailto(mailaddr, username)
                writer.close()
                println("$filename is created for $mailaddr ($username)")
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }

        fun makeLinkPage(filename: String) {
            try {
                val mailprop = Database.getProperties("part15")
                val writer = HtmlWriter(FileWriter(filename))
                writer.title("Link page")
                for (propertyName in mailprop.propertyNames()) {
                    writer.mailto(propertyName as String, mailprop.getProperty(propertyName))
                }
                writer.close()
                println("$filename is created")
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }
}
