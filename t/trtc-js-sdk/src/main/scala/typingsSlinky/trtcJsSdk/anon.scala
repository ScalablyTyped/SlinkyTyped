package typingsSlinky.trtcJsSdk

import typingsSlinky.trtcJsSdk.mod.ConnectionState
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.PAUSED
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.PLAYING
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.STOPPED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Audio extends StObject {
    
    var audio: js.UndefOr[Boolean] = js.native
    
    var video: js.UndefOr[Boolean] = js.native
  }
  object Audio {
    
    @scala.inline
    def apply(): Audio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Audio]
    }
    
    @scala.inline
    implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  @js.native
  trait CurState extends StObject {
    
    var curState: ConnectionState = js.native
    
    var prevState: ConnectionState = js.native
  }
  object CurState {
    
    @scala.inline
    def apply(curState: ConnectionState, prevState: ConnectionState): CurState = {
      val __obj = js.Dynamic.literal(curState = curState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurState]
    }
    
    @scala.inline
    implicit class CurStateMutableBuilder[Self <: CurState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurState(value: ConnectionState): Self = StObject.set(x, "curState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevState(value: ConnectionState): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var state: PLAYING | PAUSED | STOPPED = js.native
    
    var `type`: String = js.native
  }
  object State {
    
    @scala.inline
    def apply(state: PLAYING | PAUSED | STOPPED, `type`: String): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: PLAYING | PAUSED | STOPPED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
