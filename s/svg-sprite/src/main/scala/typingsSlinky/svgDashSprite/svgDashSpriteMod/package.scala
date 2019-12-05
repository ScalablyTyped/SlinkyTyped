package typingsSlinky.svgDashSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgDashSpriteMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.svgDashSprite.Anon_Plugins
  import typingsSlinky.vinyl.vinylMod.File

  type CompileCallback = js.Function3[/* error */ js.Error, /* result */ js.Any, /* data */ js.Any, js.Any]
  /**
    * Custom callback transformation
    */
  type CustomCallbackTransform = StringDictionary[
    js.Function3[/* shape */ js.Any, /* sprite */ SVGSpriter, /* callback */ js.Function, js.Any]
  ]
  /**
    * Pre-defined shape transformation with custom configuration
    */
  type CustomConfigurationTransform = StringDictionary[Anon_Plugins]
  type GetShapesCallback = js.Function2[/* error */ js.Error, /* result */ js.Array[File], js.Any]
  type SvgTransformer = js.Function1[/* svg */ String, String]
}
