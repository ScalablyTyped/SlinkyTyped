package typingsSlinky.storybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookAddons.typesMod.ClientApiAddon[StoryFnReturnType]]
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typingsSlinky.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  type DecoratorFunction[StoryFnReturnType] = js.Function2[
    /* fn */ typingsSlinky.storybookAddons.typesMod.StoryFn[StoryFnReturnType], 
    /* c */ typingsSlinky.storybookAddons.typesMod.StoryContext, 
    typingsSlinky.std.ReturnType[typingsSlinky.storybookAddons.typesMod.StoryFn[StoryFnReturnType]]
  ]
  type LoadFn = js.Function0[js.Any]
  type MakeDecoratorResult = js.Function1[/* args */ js.Any, js.Any]
  type RequireContext = js.Any
  type StoryFn[ReturnType] = js.Function1[
    /* p */ js.UndefOr[typingsSlinky.storybookAddons.typesMod.StoryContext], 
    ReturnType
  ]
  type StoryGetter = js.Function1[/* context */ typingsSlinky.storybookAddons.typesMod.StoryContext, js.Any]
  type StoryWrapper = js.Function3[
    /* getStory */ typingsSlinky.storybookAddons.typesMod.StoryGetter, 
    /* context */ typingsSlinky.storybookAddons.typesMod.StoryContext, 
    /* settings */ typingsSlinky.storybookAddons.typesMod.WrapperSettings, 
    js.Any
  ]
}
