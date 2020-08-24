package typingsSlinky.wordpressEditor.postPublishPanelMod.PostPublishPanel

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var PostPublishExtension: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var PrePublishExtension: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  @JSName("children")
  var children_Props: js.UndefOr[scala.Nothing] = js.native
  var forceIsDirty: js.UndefOr[Boolean] = js.native
  var forceIsSaving: js.UndefOr[Boolean] = js.native
  def onClose(): Unit = js.native
}

object Props {
  @scala.inline
  def apply(onClose: () => Unit): Props = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def setPostPublishExtensionFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("PostPublishExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostPublishExtensionComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("PostPublishExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostPublishExtension(value: ReactComponentClass[js.Object]): Self = this.set("PostPublishExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostPublishExtension: Self = this.set("PostPublishExtension", js.undefined)
    @scala.inline
    def setPrePublishExtensionFunctionComponent(value: ReactComponentClass[js.Object]): Self = this.set("PrePublishExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrePublishExtensionComponentClass(value: ReactComponentClass[js.Object]): Self = this.set("PrePublishExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrePublishExtension(value: ReactComponentClass[js.Object]): Self = this.set("PrePublishExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrePublishExtension: Self = this.set("PrePublishExtension", js.undefined)
    @scala.inline
    def setForceIsDirty(value: Boolean): Self = this.set("forceIsDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIsDirty: Self = this.set("forceIsDirty", js.undefined)
    @scala.inline
    def setForceIsSaving(value: Boolean): Self = this.set("forceIsSaving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIsSaving: Self = this.set("forceIsSaving", js.undefined)
  }
  
}

