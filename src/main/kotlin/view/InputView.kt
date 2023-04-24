package view

object InputView {
    fun inputCarNames():String {
        println("경주에 참여할 자동차를 쉼표로 분기해서 입력해 주세요.")
        return readln()
    }
}