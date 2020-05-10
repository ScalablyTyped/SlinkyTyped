package typingsSlinky.styledSystem.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantArgs[TStyle, K /* <: String */, TPropName] extends js.Object {
  var key: js.UndefOr[String] = js.native
  /** Component prop, defaults to "variant" */
  var prop: js.UndefOr[TPropName] = js.native
  /** theme key for variant definitions */
  var scale: js.UndefOr[String] = js.native
  /** inline theme aware variants definitions  */
  var variants: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: TStyle}
    */ typingsSlinky.styledSystem.styledSystemStrings.VariantArgs with TopLevel[js.Any]
  ] = js.native
}

object VariantArgs {
  @scala.inline
  def apply[TStyle, K, TPropName](): VariantArgs[TStyle, K, TPropName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantArgs[TStyle, K, TPropName]]
  }
  @scala.inline
  implicit class VariantArgsOps[Self[tstyle, k, tpropname] <: VariantArgs[tstyle, k, tpropname], TStyle, K, TPropName] (val x: Self[TStyle, K, TPropName]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TStyle, K, TPropName] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TStyle, K, TPropName]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TStyle, K, TPropName]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TStyle, K, TPropName]) with Other]
    @scala.inline
    def withKey(value: String): Self[TStyle, K, TPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[TStyle, K, TPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withProp(value: TPropName): Self[TStyle, K, TPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProp: Self[TStyle, K, TPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prop")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: String): Self[TStyle, K, TPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self[TStyle, K, TPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withVariants(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in K ]: TStyle}
      */ typingsSlinky.styledSystem.styledSystemStrings.VariantArgs with TopLevel[js.Any]
    ): Self[TStyle, K, TPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariants: Self[TStyle, K, TPropName] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(js.undefined)
        ret
    }
  }
  
}

