package typingsSlinky.wordpressRichText.anon

import typingsSlinky.wordpressRichText.mod.NamedFormatConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedSelectors extends js.Object {
  def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = js.native
  def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
  ): js.UndefOr[NamedFormatConfiguration] = js.native
  def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration] = js.native
  def getFormatTypes(): js.Array[NamedFormatConfiguration] = js.native
}

object TypeofimportedSelectors {
  @scala.inline
  def apply(
    getFormatType: String => js.UndefOr[NamedFormatConfiguration],
    getFormatTypeForBareElement: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.UndefOr[NamedFormatConfiguration],
    getFormatTypeForClassName: String => js.UndefOr[NamedFormatConfiguration],
    getFormatTypes: () => js.Array[NamedFormatConfiguration]
  ): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal(getFormatType = js.Any.fromFunction1(getFormatType), getFormatTypeForBareElement = js.Any.fromFunction1(getFormatTypeForBareElement), getFormatTypeForClassName = js.Any.fromFunction1(getFormatTypeForClassName), getFormatTypes = js.Any.fromFunction0(getFormatTypes))
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
  @scala.inline
  implicit class TypeofimportedSelectorsOps[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFormatType(value: String => js.UndefOr[NamedFormatConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFormatTypeForBareElement(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.UndefOr[NamedFormatConfiguration]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatTypeForBareElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFormatTypeForClassName(value: String => js.UndefOr[NamedFormatConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatTypeForClassName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFormatTypes(value: () => js.Array[NamedFormatConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormatTypes")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

