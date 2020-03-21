package typingsSlinky.storybookReactNative.storyViewMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryView
  extends Component[Props, js.Object, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MStoryView(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MStoryView(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MStoryView(): Unit = js.native
  def forceReRender(): Unit = js.native
  def renderHelp(): ReactElement = js.native
  def renderOnDeviceUIHelp(): ReactElement = js.native
}

