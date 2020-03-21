package typingsSlinky.webmidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebMidi {
  /**
    * This is a maplike interface whose value is a MIDIInput instance and key is its
    * ID.
    */
  type MIDIInputMap = typingsSlinky.std.Map[java.lang.String, typingsSlinky.webmidi.WebMidi.MIDIInput]
  /**
    * This is a maplike interface whose value is a MIDIOutput instance and key is its
    * ID.
    */
  type MIDIOutputMap = typingsSlinky.std.Map[java.lang.String, typingsSlinky.webmidi.WebMidi.MIDIOutput]
}
