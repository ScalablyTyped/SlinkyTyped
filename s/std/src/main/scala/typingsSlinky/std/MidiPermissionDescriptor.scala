package typingsSlinky.std

import typingsSlinky.std.stdStrings.midi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MidiPermissionDescriptor extends PermissionDescriptor {
  
  @JSName("name")
  var name_MidiPermissionDescriptor: midi = js.native
  
  var sysex: js.UndefOr[scala.Boolean] = js.native
}
object MidiPermissionDescriptor {
  
  @scala.inline
  def apply(name: midi): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
  
  @scala.inline
  implicit class MidiPermissionDescriptorMutableBuilder[Self <: MidiPermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: midi): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysex(value: scala.Boolean): Self = StObject.set(x, "sysex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysexUndefined: Self = StObject.set(x, "sysex", js.undefined)
  }
}
