package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wx.types.AudioSourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioSources extends StObject {
  
  /**
    * 音频输入源，每一项对应一种音频输入源
    */
  var audioSources: js.Array[AudioSourceType] = js.native
}
object AudioSources {
  
  @scala.inline
  def apply(audioSources: js.Array[AudioSourceType]): AudioSources = {
    val __obj = js.Dynamic.literal(audioSources = audioSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSources]
  }
  
  @scala.inline
  implicit class AudioSourcesMutableBuilder[Self <: AudioSources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioSources(value: js.Array[AudioSourceType]): Self = StObject.set(x, "audioSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioSourcesVarargs(value: AudioSourceType*): Self = StObject.set(x, "audioSources", js.Array(value :_*))
  }
}
