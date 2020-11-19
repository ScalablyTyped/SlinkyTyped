package typingsSlinky.styletronReact.mod

import typingsSlinky.std.ReturnType
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("styletron-react", "autoComposeDeep")
@js.native
object autoComposeDeep extends js.Object {
  
  def apply(styletron: Styletron, styleArg: js.Function1[/* props */ js.Object, StyleObject]): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* styleArg */ js.Function1[/* props */ js.Object, StyleObject], 
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof composeDynamic */ js.Any
      ]
    ]
  ] = js.native
  def apply(styletron: Styletron, styleArg: StyleObject): ReturnType[
    js.Function2[
      /* styletron */ Styletron, 
      /* style */ StyleObject, 
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof composeStatic */ js.Any
      ]
    ]
  ] = js.native
}
