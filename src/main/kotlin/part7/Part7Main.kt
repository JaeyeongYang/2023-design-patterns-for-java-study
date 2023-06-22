package part7

fun main() {
    val textBuilder = TextBuilder()
    val textDirector = Director(textBuilder)
    textDirector.construct()
    println(textBuilder.getTextResult())

    val htmlBuilder = HtmlBuilder()
    val htmlDirector = Director(htmlBuilder)
    htmlDirector.construct()
    println("HTML 파일 ${htmlBuilder.getHTMLResult()}이 작성되었습니다.")

    val markdownBuilder = MarkdownBuilder()
    val markdownDirector = Director(markdownBuilder)
    markdownDirector.construct()
    println(markdownBuilder.getMarkdownResult())
}
