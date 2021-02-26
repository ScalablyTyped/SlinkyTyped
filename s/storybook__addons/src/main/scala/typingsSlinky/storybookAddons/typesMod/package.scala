package typingsSlinky.storybookAddons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ArgTypes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookAddons.typesMod.ArgType]
  
  type Args = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ArgsStoryFn[ReturnType] = js.Function2[
    /* a */ js.UndefOr[typingsSlinky.storybookAddons.typesMod.Args], 
    /* p */ js.UndefOr[typingsSlinky.storybookAddons.typesMod.StoryContext], 
    ReturnType
  ]
  
  type BaseDecorators[StoryFnReturnType] = js.Array[
    js.Function2[
      /* story */ js.Function0[StoryFnReturnType], 
      /* context */ typingsSlinky.storybookAddons.typesMod.StoryContext, 
      StoryFnReturnType
    ]
  ]
  
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookAddons.typesMod.ClientApiAddon[StoryFnReturnType]]
  
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typingsSlinky.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Boolean | scala.Double]
  
  type DecorateStoryFunction[StoryFnReturnType] = js.Function2[
    /* storyFn */ typingsSlinky.storybookAddons.typesMod.StoryFn[StoryFnReturnType], 
    /* decorators */ js.Array[typingsSlinky.storybookAddons.typesMod.DecoratorFunction[StoryFnReturnType]], 
    typingsSlinky.storybookAddons.typesMod.StoryFn[StoryFnReturnType]
  ]
  
  type DecoratorFunction[StoryFnReturnType] = js.Function2[
    /* fn */ typingsSlinky.storybookAddons.typesMod.StoryFn[StoryFnReturnType], 
    /* c */ typingsSlinky.storybookAddons.typesMod.StoryContext, 
    typingsSlinky.std.ReturnType[typingsSlinky.storybookAddons.typesMod.StoryFn[StoryFnReturnType]]
  ]
  
  type LegacyStoryFn[ReturnType] = js.Function1[
    /* p */ js.UndefOr[typingsSlinky.storybookAddons.typesMod.StoryContext], 
    ReturnType
  ]
  
  type LoadFn = js.Function0[js.Any]
  
  type Loadable = typingsSlinky.storybookAddons.typesMod.RequireContext | js.Array[typingsSlinky.storybookAddons.typesMod.RequireContext] | typingsSlinky.storybookAddons.typesMod.LoadFn
  
  type LoaderFunction = js.Function1[
    /* c */ typingsSlinky.storybookAddons.typesMod.StoryContext, 
    js.Promise[typingsSlinky.std.Record[java.lang.String, js.Any]]
  ]
  
  type MakeDecoratorResult = js.Function1[/* args */ js.Any, js.Any]
  
  type RequireContext = js.Any
  
  type StoryFn[ReturnType] = typingsSlinky.storybookAddons.typesMod.LegacyStoryFn[ReturnType] | typingsSlinky.storybookAddons.typesMod.ArgsStoryFn[ReturnType]
  
  type StoryGetter = js.Function1[/* context */ typingsSlinky.storybookAddons.typesMod.StoryContext, js.Any]
  
  type StoryId = java.lang.String
  
  type StoryKind = java.lang.String
  
  type StoryName = java.lang.String
  
  type StorySortComparator = typingsSlinky.storybookAddons.typesMod.Comparator[
    js.Tuple4[
      typingsSlinky.storybookAddons.typesMod.StoryId, 
      js.Any, 
      typingsSlinky.storybookAddons.typesMod.Parameters, 
      typingsSlinky.storybookAddons.typesMod.Parameters
    ]
  ]
  
  type StorySortParameter = typingsSlinky.storybookAddons.typesMod.StorySortComparator | typingsSlinky.storybookAddons.typesMod.StorySortObjectParameter
  
  type StoryWrapper = js.Function3[
    /* getStory */ typingsSlinky.storybookAddons.typesMod.StoryGetter, 
    /* context */ typingsSlinky.storybookAddons.typesMod.StoryContext, 
    /* settings */ typingsSlinky.storybookAddons.typesMod.WrapperSettings, 
    js.Any
  ]
  
  type Types_ = typingsSlinky.storybookAddons.typesMod.types | java.lang.String
  
  @scala.inline
  def isSupportedType(`type`: typingsSlinky.storybookAddons.typesMod.Types_): scala.Boolean = typingsSlinky.storybookAddons.typesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedType")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
