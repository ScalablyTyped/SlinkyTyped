package typingsSlinky.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod.ToneConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Tones extends js.Object
/** **`2017-09-21`:** Deprecated. The service continues to accept the parameter for backward-compatibility, but the parameter no longer affects the response. **`2016-05-19`:** A comma-separated list of tones for which the service is to return its analysis of the input; the indicated tones apply both to the full document and to individual sentences of the document. You can specify one or more of the valid values. Omit the parameter to request results for all three tones. */
@JSImport("watson-developer-cloud/tone-analyzer/v3-generated", "ToneConstants.Tones")
@js.native
object Tones extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Tones with String] = js.native
  
  @js.native
  sealed trait EMOTION extends Tones
  /* "emotion" */ @js.native
  object EMOTION extends TopLevel[EMOTION with String]
  
  @js.native
  sealed trait LANGUAGE extends Tones
  /* "language" */ @js.native
  object LANGUAGE extends TopLevel[LANGUAGE with String]
  
  @js.native
  sealed trait SOCIAL extends Tones
  /* "social" */ @js.native
  object SOCIAL extends TopLevel[SOCIAL with String]
}
