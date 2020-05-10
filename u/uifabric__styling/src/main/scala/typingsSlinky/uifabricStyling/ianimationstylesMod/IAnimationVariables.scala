package typingsSlinky.uifabricStyling.ianimationstylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimationVariables extends js.Object {
  var durationValue1: String = js.native
  var durationValue2: String = js.native
  var durationValue3: String = js.native
  var durationValue4: String = js.native
  var easeFunction1: String = js.native
  var easeFunction2: String = js.native
}

object IAnimationVariables {
  @scala.inline
  def apply(
    durationValue1: String,
    durationValue2: String,
    durationValue3: String,
    durationValue4: String,
    easeFunction1: String,
    easeFunction2: String
  ): IAnimationVariables = {
    val __obj = js.Dynamic.literal(durationValue1 = durationValue1.asInstanceOf[js.Any], durationValue2 = durationValue2.asInstanceOf[js.Any], durationValue3 = durationValue3.asInstanceOf[js.Any], durationValue4 = durationValue4.asInstanceOf[js.Any], easeFunction1 = easeFunction1.asInstanceOf[js.Any], easeFunction2 = easeFunction2.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationVariables]
  }
  @scala.inline
  implicit class IAnimationVariablesOps[Self <: IAnimationVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationValue1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationValue1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationValue2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationValue2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationValue3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationValue3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationValue4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationValue4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseFunction1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeFunction1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEaseFunction2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easeFunction2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

