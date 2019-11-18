package typingsSlinky.atStorybookReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atStorybookReactMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atStorybookReact.Anon_Kind
  import typingsSlinky.react.reactMod.ComponentType
  import typingsSlinky.react.reactMod._Global_.JSX.Element

  type DecoratorParameters = StringDictionary[js.Any]
  type RenderFunction = js.Function0[Renderable | js.Array[Renderable]]
  type Renderable = ComponentType[js.Object] | Element
  type StoryDecorator = js.Function2[/* story */ RenderFunction, /* context */ Anon_Kind, Renderable | Null]
}
