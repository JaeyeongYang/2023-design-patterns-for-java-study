package part13

fun main() {
    println("Making root entries...")

    val rootDir = Directory("root")
    val binDir = Directory("bin")
    val tmpDir = Directory("tmp")
    val usrDir = Directory("usr")

    rootDir.add(binDir).add(tmpDir).add(usrDir)
    binDir.add(File("vi", 10000)).add(File("latex", 20000))

    rootDir.accept(ListVisitor())
    println()

    println("Making user entries...")
    val jaeyeong = Directory("jaeyeong")
    val youngjin = Directory("youngjin")
    val changjun = Directory("changjun")
    usrDir.add(jaeyeong).add(youngjin).add(changjun)

    jaeyeong.add(File("diary.html", 100))
        .add(File("Composite.java", 200))
    youngjin.add(File("memo.tex", 300))
    changjun.add(File("game.doc", 400))
        .add(File("junk.mail", 500))

    rootDir.accept(ListVisitor())
}
