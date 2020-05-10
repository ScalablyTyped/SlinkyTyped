package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storiesMod {
  type GroupsList = js.Array[typingsSlinky.storybookApi.storiesMod.Group]
  type ParameterName = java.lang.String
  type StoriesHash = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.storybookApi.storiesMod.Group | typingsSlinky.storybookApi.storiesMod.Story
  ]
  type StoriesList = js.Array[
    typingsSlinky.storybookApi.storiesMod.Group | typingsSlinky.storybookApi.storiesMod.Story
  ]
  type StoriesRaw = org.scalablytyped.runtime.StringDictionary[typingsSlinky.storybookApi.storiesMod.StoryInput]
  type Story = typingsSlinky.storybookApi.storiesMod.StoryInput with typingsSlinky.storybookApi.storiesMod.Group
  type StoryId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookApi.storybookApiStrings.story
    - typingsSlinky.storybookApi.storybookApiStrings.info
    - typingsSlinky.storybookApi.storybookApiStrings.settings
    - js.UndefOr[scala.Nothing]
  */
  type ViewMode = js.UndefOr[typingsSlinky.storybookApi.storiesMod._ViewMode]
}
