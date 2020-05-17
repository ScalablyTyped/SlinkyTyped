package typingsSlinky.storybookPolymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DecoratorParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RenderFunction = js.Function0[
    typingsSlinky.storybookPolymer.mod.Renderable | js.Array[typingsSlinky.storybookPolymer.mod.Renderable]
  ]
  type Renderable = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateResult */ js.Any
  type StoryDecorator = js.Function2[
    /* story */ typingsSlinky.storybookPolymer.mod.RenderFunction, 
    /* context */ typingsSlinky.storybookPolymer.anon.Kind, 
    typingsSlinky.storybookPolymer.mod.Renderable | scala.Null
  ]
}
