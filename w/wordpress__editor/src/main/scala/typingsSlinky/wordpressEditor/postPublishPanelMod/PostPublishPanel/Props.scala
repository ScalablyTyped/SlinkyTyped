package typingsSlinky.wordpressEditor.postPublishPanelMod.PostPublishPanel

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var PostPublishExtension: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
  var PrePublishExtension: js.UndefOr[ReactComponentClass[js.Object]] = js.undefined
  var forceIsDirty: js.UndefOr[Boolean] = js.undefined
  var forceIsSaving: js.UndefOr[Boolean] = js.undefined
  def onClose(): Unit
}

object Props {
  @scala.inline
  def apply(
    onClose: () => Unit,
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    PostPublishExtension: ReactComponentClass[js.Object] = null,
    PrePublishExtension: ReactComponentClass[js.Object] = null,
    forceIsDirty: js.UndefOr[Boolean] = js.undefined,
    forceIsSaving: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose))
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (PostPublishExtension != null) __obj.updateDynamic("PostPublishExtension")(PostPublishExtension.asInstanceOf[js.Any])
    if (PrePublishExtension != null) __obj.updateDynamic("PrePublishExtension")(PrePublishExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsDirty)) __obj.updateDynamic("forceIsDirty")(forceIsDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

