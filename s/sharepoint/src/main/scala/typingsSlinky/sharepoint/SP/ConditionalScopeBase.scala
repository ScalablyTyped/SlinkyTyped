package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalScopeBase extends js.Object {
  def customFromJson(initValue: js.Any): Boolean = js.native
  def fromJson(initValue: js.Any): Unit = js.native
  def get_testResult(): Boolean = js.native
  def startIfFalse(): js.Any = js.native
  def startIfTrue(): js.Any = js.native
  def startScope(): js.Any = js.native
}

object ConditionalScopeBase {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    fromJson: js.Any => Unit,
    get_testResult: () => Boolean,
    startIfFalse: () => js.Any,
    startIfTrue: () => js.Any,
    startScope: () => js.Any
  ): ConditionalScopeBase = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson), get_testResult = js.Any.fromFunction0(get_testResult), startIfFalse = js.Any.fromFunction0(startIfFalse), startIfTrue = js.Any.fromFunction0(startIfTrue), startScope = js.Any.fromFunction0(startScope))
    __obj.asInstanceOf[ConditionalScopeBase]
  }
  @scala.inline
  implicit class ConditionalScopeBaseOps[Self <: ConditionalScopeBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomFromJson(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFromJson")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromJson(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJson")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet_testResult(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_testResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartIfFalse(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIfFalse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartIfTrue(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIfTrue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartScope(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startScope")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

