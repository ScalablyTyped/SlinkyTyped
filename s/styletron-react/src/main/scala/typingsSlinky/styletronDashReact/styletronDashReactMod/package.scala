package typingsSlinky.styletronDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styletronDashReactMod {
  import slinky.core.ReactComponentClass
  import slinky.core.facade.ReactElement
  import typingsSlinky.react.reactMod.ComponentProps
  import typingsSlinky.styletronDashReact.Anon_STYLETRON
  import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StandardEngine
  import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StyleObject

  type $StyleProp[P /* <: js.Object */] = StyleObject | StyleObjectFn[P]
  type CSSFn = js.Function1[/* style */ StyleObject, String]
  type Reducer = js.Function2[/* style */ StyleObject, /* props */ js.UndefOr[js.Object], StyleObject]
  type StackIndex = Double
  type StyleObjectFn[P /* <: js.Object */] = js.Function1[/* props */ P, StyleObject]
  type StyletronBase = ReactElement
  type StyletronComponent[P /* <: js.Object */] = (ReactComponentClass[P with StyletronComponentInjectedProps[P]]) with Anon_STYLETRON
  type StyletronDriver = js.Function2[/* style */ StyleObject, /* styletron */ StandardEngine, String]
  type StyletronGetInitialStyle = js.Function0[StyleObject]
  type StyletronWrapper = js.Function1[/* fc */ ReactComponentClass[js.Any], ReactComponentClass[js.Any]]
  type WithTransformFn = js.Function2[
    /* component */ StyletronComponent[js.Any], 
    /* style */ js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject], 
    StyletronComponent[ComponentProps[StyletronComponent[_]] with js.Object]
  ]
  type WithWrapperFn = js.Function2[
    /* component */ StyletronComponent[js.Any], 
    /* wrapper */ js.Function1[/* component */ StyletronComponent[js.Any], ReactComponentClass[js.Object]], 
    StyletronComponent[ComponentProps[StyletronComponent[_]] with js.Object]
  ]
}
