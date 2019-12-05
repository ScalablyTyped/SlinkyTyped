package typingsSlinky.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecConfigMod {
  import typingsSlinky.std.Record
  import typingsSlinky.vegaDashTypings.typesSpecAxisMod.BaseAxis
  import typingsSlinky.vegaDashTypings.typesSpecProjectionMod.BaseProjection
  import typingsSlinky.vegaDashTypings.typesSpecStreamMod.EventType
  import typingsSlinky.vegaDashTypings.typesSpecTitleMod.BaseTitle
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.allow
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.mark
  import typingsSlinky.vegaDashTypings.vegaDashTypingsStrings.prevent

  type AxisConfig = BaseAxis
  type DefaultsConfig = Record[prevent | allow, Boolean | js.Array[EventType]]
  type MarkConfigKeys = mark | (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/mark.Mark['type'] */ js.Any)
  type ProjectionConfig = BaseProjection
  type TitleConfig = BaseTitle
}
