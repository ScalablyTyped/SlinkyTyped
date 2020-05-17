package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the Print3DTaskSourceRequestedHandler delegate. */
@js.native
trait Print3DTaskSourceRequestedArgs extends js.Object {
  /**
    * Specifies the 3D Manufacturing Format (3MF) package to use in the print job.
    * @param source The 3D Manufacturing Format (3MF) package to use in the print job.
    */
  def setSource(source: Printing3D3MFPackage): Unit = js.native
}

object Print3DTaskSourceRequestedArgs {
  @scala.inline
  def apply(setSource: Printing3D3MFPackage => Unit): Print3DTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[Print3DTaskSourceRequestedArgs]
  }
  @scala.inline
  implicit class Print3DTaskSourceRequestedArgsOps[Self <: Print3DTaskSourceRequestedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetSource(value: Printing3D3MFPackage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSource")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

