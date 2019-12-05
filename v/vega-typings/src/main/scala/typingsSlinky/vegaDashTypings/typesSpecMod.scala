package typingsSlinky.vegaDashTypings

import typingsSlinky.vegaDashTypings.typesSpecAutosizeMod.AutoSize
import typingsSlinky.vegaDashTypings.typesSpecBackgroundMod.Background
import typingsSlinky.vegaDashTypings.typesSpecConfigMod.Config
import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.Encodable
import typingsSlinky.vegaDashTypings.typesSpecEncodeMod.EncodeEntry
import typingsSlinky.vegaDashTypings.typesSpecPaddingMod.Padding
import typingsSlinky.vegaDashTypings.typesSpecScopeMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/spec", JSImport.Namespace)
@js.native
object typesSpecMod extends js.Object {
  @js.native
  trait Spec
    extends Scope
       with Encodable[EncodeEntry] {
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    var autosize: js.UndefOr[AutoSize] = js.native
    var background: js.UndefOr[Background] = js.native
    var config: js.UndefOr[Config] = js.native
    var description: js.UndefOr[String] = js.native
    var height: js.UndefOr[Double] = js.native
    var padding: js.UndefOr[Padding] = js.native
    var style: js.UndefOr[String | js.Array[String]] = js.native
    var width: js.UndefOr[Double] = js.native
  }
  
}

