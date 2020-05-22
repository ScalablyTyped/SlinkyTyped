package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamMod {
  type EventSource = (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) with js.Object
  type EventStream = typingsSlinky.vegaTypings.streamMod.StreamParameters with (typingsSlinky.vegaTypings.anon.Source | typingsSlinky.vegaTypings.anon.Type)
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.streamMod.EventStream
    - typingsSlinky.vegaTypings.streamMod.DerivedStream
    - typingsSlinky.vegaTypings.streamMod.MergedStream
  */
  type Stream = typingsSlinky.vegaTypings.streamMod._Stream | typingsSlinky.vegaTypings.streamMod.EventStream
  type WindowEventType = typingsSlinky.vegaTypings.streamMod.EventType | java.lang.String
}
