package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storiesMod {
  
  type GroupsList = js.Array[
    typingsSlinky.storybookApi.storiesMod.Root | typingsSlinky.storybookApi.storiesMod.Group
  ]
  
  type SetStoriesPayload = typingsSlinky.storybookApi.anon.Error | (typingsSlinky.storybookApi.anon.Stories with (typingsSlinky.std.Record[java.lang.String, scala.Nothing]))
  
  type StoriesHash = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.storybookApi.storiesMod.Root | typingsSlinky.storybookApi.storiesMod.Group | typingsSlinky.storybookApi.storiesMod.Story
  ]
  
  type StoriesList = js.Array[
    typingsSlinky.storybookApi.storiesMod.Group | typingsSlinky.storybookApi.storiesMod.Story
  ]
  
  type StoriesRaw = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookApi.storiesMod.StoryInput]
}
