package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection properties that are specific to the Digital Rights Management (DRM) protection of the MediaStreamSample . */
@js.native
trait MediaStreamSampleProtectionProperties extends js.Object {
  /**
    * Gets the Digital Rights Management (DRM) initialization vector from the MediaStreamSample .
    * @return The initialization vector.
    */
  def getInitializationVector(): js.Array[Double] = js.native
  /**
    * Gets the Digital Rights Management (DRM) key identifier from the MediaStreamSample .
    * @return Receives the key identifier used to decrypt the data.
    */
  def getKeyIdentifier(): js.Array[Double] = js.native
  /**
    * Gets the Digital Rights Management (DRM) sub-sample mapping from the MediaStreamSample .
    * @return Receives the sub-sample mapping.
    */
  def getSubSampleMapping(): js.Array[Double] = js.native
  /**
    * Sets the Digital Rights Management (DRM) initialization vector for the MediaStreamSample .
    * @param value The value to set the DRM initialization vector to.
    */
  def setInitializationVector(value: js.Array[Double]): Unit = js.native
  /**
    * Sets the Digital Rights Management (DRM) key identifier for the MediaStreamSample .
    * @param value The value to set the DRM key identifier to.
    */
  def setKeyIdentifier(value: js.Array[Double]): Unit = js.native
  /**
    * Sets the Digital Rights Management (DRM) sub-sample mapping for the MediaStreamSample .
    * @param value The value to set the DRM sub-sample mapping to.
    */
  def setSubSampleMapping(value: js.Array[Double]): Unit = js.native
}

object MediaStreamSampleProtectionProperties {
  @scala.inline
  def apply(
    getInitializationVector: () => js.Array[Double],
    getKeyIdentifier: () => js.Array[Double],
    getSubSampleMapping: () => js.Array[Double],
    setInitializationVector: js.Array[Double] => Unit,
    setKeyIdentifier: js.Array[Double] => Unit,
    setSubSampleMapping: js.Array[Double] => Unit
  ): MediaStreamSampleProtectionProperties = {
    val __obj = js.Dynamic.literal(getInitializationVector = js.Any.fromFunction0(getInitializationVector), getKeyIdentifier = js.Any.fromFunction0(getKeyIdentifier), getSubSampleMapping = js.Any.fromFunction0(getSubSampleMapping), setInitializationVector = js.Any.fromFunction1(setInitializationVector), setKeyIdentifier = js.Any.fromFunction1(setKeyIdentifier), setSubSampleMapping = js.Any.fromFunction1(setSubSampleMapping))
    __obj.asInstanceOf[MediaStreamSampleProtectionProperties]
  }
  @scala.inline
  implicit class MediaStreamSampleProtectionPropertiesOps[Self <: MediaStreamSampleProtectionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetInitializationVector(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitializationVector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetKeyIdentifier(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyIdentifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSubSampleMapping(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSubSampleMapping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetInitializationVector(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInitializationVector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetKeyIdentifier(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setKeyIdentifier")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSubSampleMapping(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSubSampleMapping")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

