package typingsSlinky.storybookApi.anon

import typingsSlinky.storybookApi.layoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusOnUIElement extends js.Object {
  def focusOnUIElement(): Unit = js.native
  def focusOnUIElement(elementId: String): Unit = js.native
  def getInitialOptions(): Layout = js.native
  def resetLayout(): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def setOptions(options: js.Any): Unit = js.native
  def toggleFullscreen(): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def toggleFullscreen(toggled: Boolean): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def toggleNav(): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def toggleNav(toggled: Boolean): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def togglePanel(): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def togglePanel(toggled: Boolean): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def togglePanelPosition(): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def togglePanelPosition(position: PanelPositions): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def toggleToolbar(): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
  def toggleToolbar(toggled: Boolean): js.Promise[typingsSlinky.storybookApi.mod.State] = js.native
}

