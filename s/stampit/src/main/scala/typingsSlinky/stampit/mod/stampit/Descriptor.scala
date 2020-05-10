package typingsSlinky.stampit.mod.stampit

import typingsSlinky.stampit.mod.MethodMap
import typingsSlinky.stampit.mod.PropertyMap
import typingsSlinky.stampit.mod.StampSignature
import typingsSlinky.std.PropertyDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Stamp`'s metadata.
  * @template Obj The type of the object instance being produced by the `Stamp`.
  * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
  */
@js.native
trait Descriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends js.Object {
  /** An array of functions that will run in sequence while creating a new `Stamp` from a list of `Composable`s. The resulting `Stamp` and the `Composable`s get passed to composers. */
  var composers: js.UndefOr[js.Array[Composer[S̤t̤a̤m̤p̤]]] = js.native
  /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be copied by assignment. */
  var configuration: js.UndefOr[PropertyMap] = js.native
  /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be deep merged. */
  var deepConfiguration: js.UndefOr[PropertyMap] = js.native
  /** A set of properties that will be added to new object instances by deep property merge. */
  var deepProperties: js.UndefOr[PropertyMap] = js.native
  /** An array of functions that will run in sequence while creating an object instance from a `Stamp`. `Stamp` details and arguments get passed to initializers. */
  var initializers: js.UndefOr[(Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])] = js.native
  /** A set of methods that will be added to the object's delegate prototype. */
  var methods: js.UndefOr[MethodMap[Obj]] = js.native
  /** A set of properties that will be added to new object instances by assignment. */
  var properties: js.UndefOr[PropertyMap] = js.native
  /** A set of object property descriptors (`PropertyDescriptor`) used for fine-grained control over object property behaviors. */
  var propertyDescriptors: js.UndefOr[PropertyDescriptorMap] = js.native
  /** A set of static properties that will be added to the `Stamp` by deep property merge. */
  var staticDeepProperties: js.UndefOr[PropertyMap] = js.native
  /** A set of static properties that will be copied by assignment to the `Stamp`. */
  var staticProperties: js.UndefOr[PropertyMap] = js.native
  /** A set of object property descriptors (`PropertyDescriptor`) to apply to the `Stamp`. */
  var staticPropertyDescriptors: js.UndefOr[PropertyDescriptorMap] = js.native
}

object Descriptor {
  @scala.inline
  def apply[Obj, S̤t̤a̤m̤p̤](): Descriptor[Obj, S̤t̤a̤m̤p̤] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Descriptor[Obj, S̤t̤a̤m̤p̤]]
  }
  @scala.inline
  implicit class DescriptorOps[Self[obj, s̤t̤a̤m̤p̤] <: Descriptor[obj, s̤t̤a̤m̤p̤], Obj, S̤t̤a̤m̤p̤] (val x: Self[Obj, S̤t̤a̤m̤p̤]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Obj, S̤t̤a̤m̤p̤] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Obj, S̤t̤a̤m̤p̤]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Obj, S̤t̤a̤m̤p̤]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Obj, S̤t̤a̤m̤p̤]) with Other]
    @scala.inline
    def withComposers(value: js.Array[Composer[S̤t̤a̤m̤p̤]]): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposers: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composers")(js.undefined)
        ret
    }
    @scala.inline
    def withConfiguration(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepConfiguration(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepConfiguration: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepProperties(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepProperties: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withInitializers(value: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitializers: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializers")(js.undefined)
        ret
    }
    @scala.inline
    def withMethods(value: MethodMap[Obj]): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethods: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyDescriptors(value: PropertyDescriptorMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyDescriptors: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyDescriptors")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticDeepProperties(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticDeepProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticDeepProperties: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticDeepProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticProperties(value: PropertyMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticProperties: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticPropertyDescriptors(value: PropertyDescriptorMap): Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticPropertyDescriptors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticPropertyDescriptors: Self[Obj, S̤t̤a̤m̤p̤] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticPropertyDescriptors")(js.undefined)
        ret
    }
  }
  
}

