package typingsSlinky.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashPlugin extends js.Object {
  var flashReady: Boolean = js.native
  var showOutput: Boolean = js.native
  // methods
  def create(src: String): AbstractSoundInstance = js.native
  def getVolume(): Double = js.native
  def isPreloadStarted(src: String): Boolean = js.native
  def preload(src: String, instance: js.Object): Unit = js.native
  def register(src: String, instances: Double): js.Object = js.native
  def removeAllSounds(): Unit = js.native
  def removeSound(src: String): Unit = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Boolean = js.native
}

object FlashPlugin {
  @scala.inline
  def apply(
    create: String => AbstractSoundInstance,
    flashReady: Boolean,
    getVolume: () => Double,
    isPreloadStarted: String => Boolean,
    preload: (String, js.Object) => Unit,
    register: (String, Double) => js.Object,
    removeAllSounds: () => Unit,
    removeSound: String => Unit,
    setMute: Boolean => Boolean,
    setVolume: Double => Boolean,
    showOutput: Boolean
  ): FlashPlugin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), flashReady = flashReady.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), preload = js.Any.fromFunction2(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction0(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume), showOutput = showOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashPlugin]
  }
  @scala.inline
  implicit class FlashPluginOps[Self <: FlashPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: String => AbstractSoundInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlashReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetVolume(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVolume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPreloadStarted(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreloadStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreload(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegister(value: (String, Double) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAllSounds(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllSounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveSound(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSound")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMute(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVolume(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVolume")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowOutput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOutput")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

