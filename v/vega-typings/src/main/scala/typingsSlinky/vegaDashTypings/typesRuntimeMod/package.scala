package typingsSlinky.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRuntimeMod {
  import org.scalajs.dom.raw.KeyboardEvent
  import org.scalajs.dom.raw.MouseEvent
  import org.scalajs.dom.raw.TouchEvent
  import typingsSlinky.vegaDashTypings.Anon_Fill
  import typingsSlinky.vegaDashTypings.typesSpecSignalMod.SignalValue
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.`axis-label`
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.`legend-label`
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.`legend-symbol`
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.arc
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.area
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.group
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.image
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.line
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.path
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.rect
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.symbol
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.text

  type DataListenerHandler = js.Function2[/* name */ String, /* value */ js.Any, Unit]
  type EventListenerHandler = js.Function2[/* event */ ScenegraphEvent, /* item */ js.UndefOr[Item[js.Any]], Unit]
  type ResizeHandler = js.Function2[/* width */ Double, /* height */ Double, Unit]
  type Runtime = js.Any
  type RuntimeMark = DefineMark[
    group | rect | symbol | path | arc | area | line | image | text, 
    Anon_Fill | js.Object, 
    `legend-symbol` | `axis-label` | `legend-label` | scala.Nothing
  ]
  type ScenegraphEvent = MouseEvent | TouchEvent | KeyboardEvent
  type SignalListenerHandler = js.Function2[/* name */ String, /* value */ SignalValue, Unit]
  type TooltipHandler = js.Function4[
    /* handler */ js.Any, 
    /* event */ MouseEvent, 
    /* item */ Item[js.Any], 
    /* value */ js.Any, 
    Unit
  ]
}
