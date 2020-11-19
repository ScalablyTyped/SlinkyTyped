package typingsSlinky.storybookAddonKnobs.panelMod

import typingsSlinky.react.mod.Component
import typingsSlinky.storybookAddonKnobs.anon.Knobs
import typingsSlinky.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnobPanel
  extends Component[KnobPanelProps, js.Object, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MKnobPanel(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MKnobPanel(): Unit = js.native
  
  def copy(): Unit = js.native
  
  def emitChange(changedKnob: KnobStoreKnob): Unit = js.native
  
  def handleChange(changedKnob: KnobStoreKnob): Unit = js.native
  
  def handleClick(knob: KnobStoreKnob): Unit = js.native
  
  var lastEdit: Double = js.native
  
  var loadedFromUrl: Boolean = js.native
  
  var mounted: Boolean = js.native
  
  var options: KnobPanelOptions = js.native
  
  def reset(): Unit = js.native
  
  def setKnobs(hasKnobsTimestamp: Knobs): Unit = js.native
  
  def setOptions(): Unit = js.native
  def setOptions(options: KnobPanelOptions): Unit = js.native
  
  @JSName("state")
  var state_KnobPanel: KnobPanelState = js.native
  
  var stopListeningOnStory: js.Function = js.native
}
