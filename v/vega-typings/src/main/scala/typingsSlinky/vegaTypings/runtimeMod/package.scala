package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeMod {
  type DataListenerHandler = js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]
  type EventListenerHandler = js.Function2[
    /* event */ typingsSlinky.vegaTypings.runtimeMod.ScenegraphEvent, 
    /* item */ js.UndefOr[typingsSlinky.vegaTypings.runtimeMod.Item[js.Any]], 
    scala.Unit
  ]
  type NumberFormat = js.Function1[/* number */ scala.Double, java.lang.String]
  type ResizeHandler = js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]
  type Runtime = js.Any
  type RuntimeMark = typingsSlinky.vegaTypings.runtimeMod.DefineMark[
    typingsSlinky.vegaTypings.vegaTypingsStrings.group | typingsSlinky.vegaTypings.vegaTypingsStrings.rect | typingsSlinky.vegaTypings.vegaTypingsStrings.symbol | typingsSlinky.vegaTypings.vegaTypingsStrings.path | typingsSlinky.vegaTypings.vegaTypingsStrings.arc | typingsSlinky.vegaTypings.vegaTypingsStrings.area | typingsSlinky.vegaTypings.vegaTypingsStrings.line | typingsSlinky.vegaTypings.vegaTypingsStrings.image | typingsSlinky.vegaTypings.vegaTypingsStrings.text, 
    typingsSlinky.vegaTypings.anon.Fill | js.Object, 
    typingsSlinky.vegaTypings.vegaTypingsStrings.`legend-symbol` | typingsSlinky.vegaTypings.vegaTypingsStrings.`axis-label` | typingsSlinky.vegaTypings.vegaTypingsStrings.`legend-label` | scala.Nothing
  ]
  type ScenegraphEvent = org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent | org.scalajs.dom.raw.KeyboardEvent
  type SignalListenerHandler = js.Function2[
    /* name */ java.lang.String, 
    /* value */ typingsSlinky.vegaTypings.signalMod.SignalValue, 
    scala.Unit
  ]
  type TimeFormat = js.Function1[/* date */ js.Date | scala.Double, java.lang.String]
  type TimeParse = js.Function1[/* dateString */ java.lang.String, js.Date]
  type TooltipHandler = js.Function4[
    /* handler */ js.Any, 
    /* event */ org.scalajs.dom.raw.MouseEvent, 
    /* item */ typingsSlinky.vegaTypings.runtimeMod.Item[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
}
