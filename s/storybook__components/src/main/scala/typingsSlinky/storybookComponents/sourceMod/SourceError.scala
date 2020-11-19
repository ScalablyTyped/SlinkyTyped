package typingsSlinky.storybookComponents.sourceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SourceError extends js.Object
@JSImport("@storybook/components/dist/blocks/Source", "SourceError")
@js.native
object SourceError extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SourceError with String] = js.native
  
  @js.native
  sealed trait NO_STORY extends SourceError
  /* "There\\u2019s no story here." */ @js.native
  object NO_STORY extends TopLevel[NO_STORY with String]
  
  @js.native
  sealed trait SOURCE_UNAVAILABLE extends SourceError
  /* "Oh no! The source is not available." */ @js.native
  object SOURCE_UNAVAILABLE extends TopLevel[SOURCE_UNAVAILABLE with String]
}
