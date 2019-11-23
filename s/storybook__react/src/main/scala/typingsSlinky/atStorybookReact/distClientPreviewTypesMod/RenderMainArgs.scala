package typingsSlinky.atStorybookReact.distClientPreviewTypesMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMainArgs extends js.Object {
  var forceRender: Boolean
  var selectedKind: String
  var selectedStory: String
  def showError(args: ShowErrorArgs): Unit
  def showException(err: js.Error): Unit
  def showMain(): Unit
  def storyFn(): js.UndefOr[ReactElement]
}

object RenderMainArgs {
  @scala.inline
  def apply(
    forceRender: Boolean,
    selectedKind: String,
    selectedStory: String,
    showError: ShowErrorArgs => Unit,
    showException: js.Error => Unit,
    showMain: () => Unit,
    storyFn: () => js.UndefOr[ReactElement]
  ): RenderMainArgs = {
    val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], selectedKind = selectedKind.asInstanceOf[js.Any], selectedStory = selectedStory.asInstanceOf[js.Any], showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain), storyFn = js.Any.fromFunction0(storyFn))
  
    __obj.asInstanceOf[RenderMainArgs]
  }
}

