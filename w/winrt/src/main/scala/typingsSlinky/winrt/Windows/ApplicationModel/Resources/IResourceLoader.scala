package typingsSlinky.winrt.Windows.ApplicationModel.Resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceLoader extends js.Object {
  def getString(resource: String): String = js.native
}

object IResourceLoader {
  @scala.inline
  def apply(getString: String => String): IResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString))
    __obj.asInstanceOf[IResourceLoader]
  }
  @scala.inline
  implicit class IResourceLoaderOps[Self <: IResourceLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetString(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getString")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

