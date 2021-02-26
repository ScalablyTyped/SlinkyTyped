package typingsSlinky.vscodeLanguageserver

import typingsSlinky.vscodeLanguageserver.mod.RemoteWindow
import typingsSlinky.vscodeLanguageserver.mod.ServerRequestHandler
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyIncomingCall
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyIncomingCallsParams
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyItem
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOutgoingCall
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyOutgoingCallsParams
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.CallHierarchyPrepareParams
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokens
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEdits
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEditsParams
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensEditsPartialResult
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensParams
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensPartialResult
import typingsSlinky.vscodeLanguageserverProtocol.mod.Proposed.SemanticTokensRangeParams
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait On extends StObject {
    
    def on(
      handler: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit]
    ): Unit = js.native
    
    def onEdits(
      handler: ServerRequestHandler[
          SemanticTokensEditsParams, 
          SemanticTokensEdits | SemanticTokens, 
          SemanticTokensEditsPartialResult, 
          Unit
        ]
    ): Unit = js.native
    
    def onRange(
      handler: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit]
    ): Unit = js.native
  }
  object On {
    
    @scala.inline
    def apply(
      on: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit,
      onEdits: ServerRequestHandler[
          SemanticTokensEditsParams, 
          SemanticTokensEdits | SemanticTokens, 
          SemanticTokensEditsPartialResult, 
          Unit
        ] => Unit,
      onRange: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
    ): On = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), onEdits = js.Any.fromFunction1(onEdits), onRange = js.Any.fromFunction1(onRange))
      __obj.asInstanceOf[On]
    }
    
    @scala.inline
    implicit class OnMutableBuilder[Self <: On] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOn(
        value: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEdits(
        value: ServerRequestHandler[
              SemanticTokensEditsParams, 
              SemanticTokensEdits | SemanticTokens, 
              SemanticTokensEditsPartialResult, 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "onEdits", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRange(
        value: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Unit
      ): Self = StObject.set(x, "onRange", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait OnIncomingCalls extends StObject {
    
    def onIncomingCalls(
      handler: ServerRequestHandler[
          CallHierarchyIncomingCallsParams, 
          js.Array[CallHierarchyIncomingCall] | Null, 
          js.Array[CallHierarchyIncomingCall], 
          Unit
        ]
    ): Unit = js.native
    
    def onOutgoingCalls(
      handler: ServerRequestHandler[
          CallHierarchyOutgoingCallsParams, 
          js.Array[CallHierarchyOutgoingCall] | Null, 
          js.Array[CallHierarchyOutgoingCall], 
          Unit
        ]
    ): Unit = js.native
    
    def onPrepare(
      handler: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit]
    ): Unit = js.native
  }
  object OnIncomingCalls {
    
    @scala.inline
    def apply(
      onIncomingCalls: ServerRequestHandler[
          CallHierarchyIncomingCallsParams, 
          js.Array[CallHierarchyIncomingCall] | Null, 
          js.Array[CallHierarchyIncomingCall], 
          Unit
        ] => Unit,
      onOutgoingCalls: ServerRequestHandler[
          CallHierarchyOutgoingCallsParams, 
          js.Array[CallHierarchyOutgoingCall] | Null, 
          js.Array[CallHierarchyOutgoingCall], 
          Unit
        ] => Unit,
      onPrepare: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit] => Unit
    ): OnIncomingCalls = {
      val __obj = js.Dynamic.literal(onIncomingCalls = js.Any.fromFunction1(onIncomingCalls), onOutgoingCalls = js.Any.fromFunction1(onOutgoingCalls), onPrepare = js.Any.fromFunction1(onPrepare))
      __obj.asInstanceOf[OnIncomingCalls]
    }
    
    @scala.inline
    implicit class OnIncomingCallsMutableBuilder[Self <: OnIncomingCalls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnIncomingCalls(
        value: ServerRequestHandler[
              CallHierarchyIncomingCallsParams, 
              js.Array[CallHierarchyIncomingCall] | Null, 
              js.Array[CallHierarchyIncomingCall], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "onIncomingCalls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOutgoingCalls(
        value: ServerRequestHandler[
              CallHierarchyOutgoingCallsParams, 
              js.Array[CallHierarchyOutgoingCall] | Null, 
              js.Array[CallHierarchyOutgoingCall], 
              Unit
            ] => Unit
      ): Self = StObject.set(x, "onOutgoingCalls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPrepare(
        value: ServerRequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, scala.Nothing, Unit] => Unit
      ): Self = StObject.set(x, "onPrepare", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Placeholder extends StObject {
    
    var placeholder: String = js.native
    
    var range: Range = js.native
  }
  object Placeholder {
    
    @scala.inline
    def apply(placeholder: String, range: Range): Placeholder = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Placeholder]
    }
    
    @scala.inline
    implicit class PlaceholderMutableBuilder[Self <: Placeholder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Window extends StObject {
    
    var window: RemoteWindow = js.native
  }
  object Window {
    
    @scala.inline
    def apply(window: RemoteWindow): Window = {
      val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindow(value: RemoteWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
}
