package typingsSlinky.atStorybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distBlocksStoryMod {
  import typingsSlinky.atStorybookComponents.Anon_Error
  import typingsSlinky.atStorybookComponents.Anon_Inline
  import typingsSlinky.atStorybookComponents.Anon_StoryFn

  type ErrorProps = Anon_Error with CommonProps
  type IFrameStoryProps = CommonProps
  type InlineStoryProps = Anon_StoryFn with CommonProps
  type StoryProps = (InlineStoryProps | IFrameStoryProps | ErrorProps) with Anon_Inline
}
