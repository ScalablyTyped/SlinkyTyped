package typingsSlinky.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractPlugin extends js.Object {
  // methods
  def create(src: String, startTime: Double, duration: Double): AbstractSoundInstance = js.native
  def getVolume(): Double = js.native
  def isPreloadComplete(src: String): Boolean = js.native
  def isPreloadStarted(src: String): Boolean = js.native
  def isSupported(): Boolean = js.native
  def preload(loader: js.Object): Unit = js.native
  def register(loadItem: String, instances: Double): js.Object = js.native
  def removeAllSounds(src: String): Unit = js.native
  def removeSound(src: String): Unit = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Boolean = js.native
}

object AbstractPlugin {
  @scala.inline
  def apply(
    create: (String, Double, Double) => AbstractSoundInstance,
    getVolume: () => Double,
    isPreloadComplete: String => Boolean,
    isPreloadStarted: String => Boolean,
    isSupported: () => Boolean,
    preload: js.Object => Unit,
    register: (String, Double) => js.Object,
    removeAllSounds: String => Unit,
    removeSound: String => Unit,
    setMute: Boolean => Boolean,
    setVolume: Double => Boolean
  ): AbstractPlugin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume))
    __obj.asInstanceOf[AbstractPlugin]
  }
  @scala.inline
  implicit class AbstractPluginOps[Self <: AbstractPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: (String, Double, Double) => AbstractSoundInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetVolume(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVolume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPreloadComplete(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreloadComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsPreloadStarted(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPreloadStarted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSupported(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPreload(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: (String, Double) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAllSounds(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAllSounds")(js.Any.fromFunction1(value))
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
  }
  
}

