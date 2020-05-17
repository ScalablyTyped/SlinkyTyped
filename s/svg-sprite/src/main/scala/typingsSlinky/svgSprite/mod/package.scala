package typingsSlinky.svgSprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CompileCallback = js.Function3[/* error */ js.Error, /* result */ js.Any, /* data */ js.Any, js.Any]
  /**
    * Custom callback transformation
    */
  type CustomCallbackTransform = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* shape */ js.Any, 
      /* sprite */ typingsSlinky.svgSprite.mod.SVGSpriter, 
      /* callback */ js.Function, 
      js.Any
    ]
  ]
  /**
    * Pre-defined shape transformation with custom configuration
    */
  type CustomConfigurationTransform = org.scalablytyped.runtime.StringDictionary[typingsSlinky.svgSprite.anon.Plugins]
  type GetShapesCallback = js.Function2[/* error */ js.Error, /* result */ js.Array[typingsSlinky.vinyl.mod.File], js.Any]
  type SvgTransformer = js.Function1[/* svg */ java.lang.String, java.lang.String]
}
