package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFunctionDefLibrary extends js.Object {
  /** FunctionDefLibrary function */
  var function: js.UndefOr[js.Array[IFunctionDef] | Null] = js.native
  /** FunctionDefLibrary gradient */
  var gradient: js.UndefOr[js.Array[IGradientDef] | Null] = js.native
}

object IFunctionDefLibrary {
  @scala.inline
  def apply(): IFunctionDefLibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFunctionDefLibrary]
  }
  @scala.inline
  implicit class IFunctionDefLibraryOps[Self <: IFunctionDefLibrary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunction(value: js.Array[IFunctionDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(null)
        ret
    }
    @scala.inline
    def withGradient(value: js.Array[IGradientDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(js.undefined)
        ret
    }
    @scala.inline
    def withGradientNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(null)
        ret
    }
  }
  
}

