package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Number extends js.Object {
  def format(value: Double, config: js.Any): String = js.native
  def getConfig(format: String): js.Any = js.native
  def numToStr(config: js.Any): WebixCallback = js.native
  def parse(value: String, config: js.Any): Double = js.native
}

object Number {
  @scala.inline
  def apply(
    format: (Double, js.Any) => String,
    getConfig: String => js.Any,
    numToStr: js.Any => WebixCallback,
    parse: (String, js.Any) => Double
  ): Number = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), getConfig = js.Any.fromFunction1(getConfig), numToStr = js.Any.fromFunction1(numToStr), parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[Number]
  }
  @scala.inline
  implicit class NumberOps[Self <: Number] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: (Double, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetConfig(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConfig")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNumToStr(value: js.Any => WebixCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numToStr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: (String, js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

