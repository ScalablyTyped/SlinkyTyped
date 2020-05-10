package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
@js.native
trait DialogNodeOutput
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** An array of objects describing the output defined for the dialog node. */
  var generic: js.UndefOr[js.Array[DialogNodeOutputGeneric]] = js.native
  /** Options that modify how specified output is handled. */
  var modifiers: js.UndefOr[DialogNodeOutputModifiers] = js.native
}

object DialogNodeOutput {
  @scala.inline
  def apply(): DialogNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutput]
  }
  @scala.inline
  implicit class DialogNodeOutputOps[Self <: DialogNodeOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneric(value: js.Array[DialogNodeOutputGeneric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generic")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: DialogNodeOutputModifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
  }
  
}

