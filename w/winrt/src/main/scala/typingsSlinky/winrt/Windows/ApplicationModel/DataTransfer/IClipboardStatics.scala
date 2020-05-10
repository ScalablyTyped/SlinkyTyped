package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClipboardStatics extends js.Object {
  var oncontentchanged: js.Any = js.native
  def clear(): Unit = js.native
  def flush(): Unit = js.native
  def getContent(): DataPackageView = js.native
  def setContent(content: DataPackage): Unit = js.native
}

object IClipboardStatics {
  @scala.inline
  def apply(
    clear: () => Unit,
    flush: () => Unit,
    getContent: () => DataPackageView,
    oncontentchanged: js.Any,
    setContent: DataPackage => Unit
  ): IClipboardStatics = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush), getContent = js.Any.fromFunction0(getContent), oncontentchanged = oncontentchanged.asInstanceOf[js.Any], setContent = js.Any.fromFunction1(setContent))
    __obj.asInstanceOf[IClipboardStatics]
  }
  @scala.inline
  implicit class IClipboardStaticsOps[Self <: IClipboardStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContent(value: () => DataPackageView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOncontentchanged(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oncontentchanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetContent(value: DataPackage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

