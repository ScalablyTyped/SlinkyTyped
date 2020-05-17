package typingsSlinky.storybookTheming.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var code: Double = js.native
  var l1: Double = js.native
  var l2: Double = js.native
  var l3: Double = js.native
  var m1: Double = js.native
  var m2: Double = js.native
  var m3: Double = js.native
  var s1: Double = js.native
  var s2: Double = js.native
  var s3: Double = js.native
}

object Code {
  @scala.inline
  def apply(
    code: Double,
    l1: Double,
    l2: Double,
    l3: Double,
    m1: Double,
    m2: Double,
    m3: Double,
    s1: Double,
    s2: Double,
    s3: Double
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], l1 = l1.asInstanceOf[js.Any], l2 = l2.asInstanceOf[js.Any], l3 = l3.asInstanceOf[js.Any], m1 = m1.asInstanceOf[js.Any], m2 = m2.asInstanceOf[js.Any], m3 = m3.asInstanceOf[js.Any], s1 = s1.asInstanceOf[js.Any], s2 = s2.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

