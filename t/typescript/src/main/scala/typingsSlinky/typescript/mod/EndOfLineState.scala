package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLineState extends StObject
@JSImport("typescript", "EndOfLineState")
@js.native
object EndOfLineState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineState with Double] = js.native
  
  @js.native
  sealed trait InDoubleQuoteStringLiteral extends EndOfLineState
  /* 3 */ val InDoubleQuoteStringLiteral: typingsSlinky.typescript.mod.EndOfLineState.InDoubleQuoteStringLiteral with Double = js.native
  
  @js.native
  sealed trait InMultiLineCommentTrivia extends EndOfLineState
  /* 1 */ val InMultiLineCommentTrivia: typingsSlinky.typescript.mod.EndOfLineState.InMultiLineCommentTrivia with Double = js.native
  
  @js.native
  sealed trait InSingleQuoteStringLiteral extends EndOfLineState
  /* 2 */ val InSingleQuoteStringLiteral: typingsSlinky.typescript.mod.EndOfLineState.InSingleQuoteStringLiteral with Double = js.native
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate extends EndOfLineState
  /* 4 */ val InTemplateHeadOrNoSubstitutionTemplate: typingsSlinky.typescript.mod.EndOfLineState.InTemplateHeadOrNoSubstitutionTemplate with Double = js.native
  
  @js.native
  sealed trait InTemplateMiddleOrTail extends EndOfLineState
  /* 5 */ val InTemplateMiddleOrTail: typingsSlinky.typescript.mod.EndOfLineState.InTemplateMiddleOrTail with Double = js.native
  
  @js.native
  sealed trait InTemplateSubstitutionPosition extends EndOfLineState
  /* 6 */ val InTemplateSubstitutionPosition: typingsSlinky.typescript.mod.EndOfLineState.InTemplateSubstitutionPosition with Double = js.native
  
  @js.native
  sealed trait None extends EndOfLineState
  /* 0 */ val None: typingsSlinky.typescript.mod.EndOfLineState.None with Double = js.native
}
