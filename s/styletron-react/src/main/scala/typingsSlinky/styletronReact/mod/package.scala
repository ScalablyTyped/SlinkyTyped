package typingsSlinky.styletronReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CSSFn = js.Function1[/* style */ typingsSlinky.styletronStandard.mod.StyleObject, java.lang.String]
  
  type Reducer = js.Function2[
    /* style */ typingsSlinky.styletronStandard.mod.StyleObject, 
    /* props */ js.UndefOr[js.Object], 
    typingsSlinky.styletronStandard.mod.StyleObject
  ]
  
  type StackIndex = scala.Double
  
  type StyleObjectFn[P /* <: js.Object */] = js.Function1[/* props */ P, typingsSlinky.styletronStandard.mod.StyleObject]
  
  type StyleProp[P /* <: js.Object */] = typingsSlinky.styletronStandard.mod.StyleObject | typingsSlinky.styletronReact.mod.StyleObjectFn[P]
  
  type StyletronBase = slinky.core.facade.ReactElement
  
  type StyletronDriver = js.Function2[
    /* style */ typingsSlinky.styletronStandard.mod.StyleObject, 
    /* styletron */ typingsSlinky.styletronStandard.mod.StandardEngine, 
    java.lang.String
  ]
  
  type StyletronGetInitialStyle = js.Function0[typingsSlinky.styletronStandard.mod.StyleObject]
  
  type StyletronWrapper = js.Function1[
    /* fc */ slinky.core.ReactComponentClass[js.Any], 
    slinky.core.ReactComponentClass[js.Any]
  ]
  
  type WithTransformFn = js.Function2[
    /* component */ typingsSlinky.styletronReact.mod.StyletronComponent[js.Any], 
    /* style */ js.Function2[
      /* style */ typingsSlinky.styletronStandard.mod.StyleObject, 
      /* props */ js.Object, 
      typingsSlinky.styletronStandard.mod.StyleObject
    ], 
    typingsSlinky.styletronReact.mod.StyletronComponent[
      typingsSlinky.react.mod.ComponentProps[typingsSlinky.styletronReact.mod.StyletronComponent[_]] with js.Object
    ]
  ]
  
  type WithWrapperFn = js.Function2[
    /* component */ typingsSlinky.styletronReact.mod.StyletronComponent[js.Any], 
    /* wrapper */ js.Function1[
      /* component */ typingsSlinky.styletronReact.mod.StyletronComponent[js.Any], 
      slinky.core.ReactComponentClass[js.Object]
    ], 
    typingsSlinky.styletronReact.mod.StyletronComponent[
      typingsSlinky.react.mod.ComponentProps[typingsSlinky.styletronReact.mod.StyletronComponent[_]] with js.Object
    ]
  ]
}
