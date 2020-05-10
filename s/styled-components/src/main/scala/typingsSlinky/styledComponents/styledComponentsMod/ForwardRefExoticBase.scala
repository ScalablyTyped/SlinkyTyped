package typingsSlinky.styledComponents.styledComponentsMod

import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import typingsSlinky.styledComponents.styledComponentsStrings.defaultProps
import typingsSlinky.styledComponents.styledComponentsStrings.propTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// abuse Pick to strip the call signature from ForwardRefExoticComponent
/* Inlined std.Pick<react.react.ForwardRefExoticComponent<P>, keyof react.react.ForwardRefExoticComponent<any>> */
@js.native
trait ForwardRefExoticBase[P] extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[Partial[typingsSlinky.styledComponents.styledComponentsStrings.defaultProps]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[
    WeakValidationMap[typingsSlinky.styledComponents.styledComponentsStrings.propTypes]
  ] = js.native
}

object ForwardRefExoticBase {
  @scala.inline
  def apply[P](DollarDollartypeof: js.Symbol): ForwardRefExoticBase[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRefExoticBase[P]]
  }
  @scala.inline
  implicit class ForwardRefExoticBaseOps[Self[p] <: ForwardRefExoticBase[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withDollarDollartypeof(value: js.Symbol): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultProps(value: Partial[defaultProps]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultProps: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withPropTypes(value: WeakValidationMap[propTypes]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropTypes: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(js.undefined)
        ret
    }
  }
  
}

