package typingsSlinky.stampit

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stampit.mod.stampit.Composable
import typingsSlinky.stampit.mod.stampit.Composer
import typingsSlinky.stampit.mod.stampit.Descriptor
import typingsSlinky.stampit.mod.stampit.Initializer
import typingsSlinky.stampit.mod.stampit.Stamp
import typingsSlinky.std.PropertyDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * A function which creates a new `Stamp`s from a list of `Composable`s.
      * @template Obj The type of the object instance being created by the `Stamp` or the type of the `Stamp` being created (when extending a `Stamp`.)
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", JSImport.Default)
    @js.native
    def apply[Obj](composables: Composable*): StampType[Obj] = js.native
    
    /** A function which creates a new `Stamp`s from a list of `Composable`s. */
    @JSImport("stampit", "default.compose")
    @js.native
    val compose: ComposeMethod = js.native
    
    /**
      * A shortcut method for stampit().composers()
      *
      * Take in a variable number of functions and add them to the composers prototype as composers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Composer functions that will run in sequence while creating a new stamp from a list of composables.  The resulting stamp and the composables get passed to composers.
      */
    @JSImport("stampit", "default.composers")
    @js.native
    def composers[Obj](functions: Composer[StampType[Obj]]*): StampType[Obj] = js.native
    @JSImport("stampit", "default.composers")
    @js.native
    def composers[Obj](functions: js.Array[Composer[StampType[Obj]]]): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().conf()
      *
      * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param confs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.conf")
    @js.native
    def conf[Obj](confs: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().configuration()
      *
      * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param confs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.configuration")
    @js.native
    def configuration[Obj](confs: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepConf()
      *
      * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepConfs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.deepConf")
    @js.native
    def deepConf[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepConfiguration()
      *
      * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepConfs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.deepConfiguration")
    @js.native
    def deepConfiguration[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepProperties()
      *
      * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepObjects The object(s) to deeply merge for each new object
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.deepProperties")
    @js.native
    def deepProperties[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepProps()
      *
      * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepObjects The object(s) to deeply merge for each new object
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.deepProps")
    @js.native
    def deepProps[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepStatics()
      *
      * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepStatics The object(s) containing static properties to be merged
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.deepStatics")
    @js.native
    def deepStatics[Obj](deepStatics: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().init()
      *
      * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Initializer functions used to create private data and privileged methods
      */
    @JSImport("stampit", "default.init")
    @js.native
    def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
    ): S̤t̤a̤m̤p̤ = js.native
    @JSImport("stampit", "default.init")
    @js.native
    def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
    ): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * A shortcut method for stampit().initializers()
      *
      * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Initializer functions used to create private data and privileged methods
      */
    @JSImport("stampit", "default.initializers")
    @js.native
    def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
    ): S̤t̤a̤m̤p̤ = js.native
    @JSImport("stampit", "default.initializers")
    @js.native
    def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
    ): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * A shortcut method for stampit().methods()
      *
      * Add methods to the methods prototype. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @template This The type to use for `this` within methods.
      * @param methods Object(s) containing map of method names and bodies for delegation.
      */
    @JSImport("stampit", "default.methods")
    @js.native
    def methods[Obj](methods: MethodMap[Obj]*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().properties()
      *
      * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param objects Object(s) to shallow assign for each new object.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.properties")
    @js.native
    def properties[Obj](objects: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().propertyDescriptors()
      *
      * Apply ES5 property descriptors to object instances created by the new Stamp returned by the function and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param descriptors
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.propertyDescriptors")
    @js.native
    def propertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().props()
      *
      * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param objects Object(s) to shallow assign for each new object.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.props")
    @js.native
    def props[Obj](objects: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().staticDeepProperties()
      *
      * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepStatics The object(s) containing static properties to be merged
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.staticDeepProperties")
    @js.native
    def staticDeepProperties[Obj](deepStatics: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().statics()
      *
      * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.staticProperties")
    @js.native
    def staticProperties[Obj](statics: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().staticPropertyDescriptors()
      *
      * Apply ES5 property descriptors to a Stamp and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param descriptors
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.staticPropertyDescriptors")
    @js.native
    def staticPropertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().staticProperties()
      *
      * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    @JSImport("stampit", "default.statics")
    @js.native
    def statics[Obj](statics: PropertyMap*): StampType[Obj] = js.native
    
    /** the version of the NPM `stampit` package. */
    @JSImport("stampit", "default.version")
    @js.native
    val version: String = js.native
  }
  
  @JSImport("stampit", "compose")
  @js.native
  val compose: ComposeMethod = js.native
  
  @JSImport("stampit", "composers")
  @js.native
  def composers[Obj](functions: Composer[StampType[Obj]]*): StampType[Obj] = js.native
  @JSImport("stampit", "composers")
  @js.native
  def composers[Obj](functions: js.Array[Composer[StampType[Obj]]]): StampType[Obj] = js.native
  
  @JSImport("stampit", "conf")
  @js.native
  def conf[Obj](confs: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "configuration")
  @js.native
  def configuration[Obj](confs: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "deepConf")
  @js.native
  def deepConf[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "deepConfiguration")
  @js.native
  def deepConfiguration[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "deepProperties")
  @js.native
  def deepProperties[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "deepProps")
  @js.native
  def deepProps[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "deepStatics")
  @js.native
  def deepStatics[Obj](deepStatics: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "init")
  @js.native
  def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
  ): S̤t̤a̤m̤p̤ = js.native
  @JSImport("stampit", "init")
  @js.native
  def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
  ): S̤t̤a̤m̤p̤ = js.native
  
  @JSImport("stampit", "initializers")
  @js.native
  def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
  ): S̤t̤a̤m̤p̤ = js.native
  @JSImport("stampit", "initializers")
  @js.native
  def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
    // tslint:disable-next-line: no-unnecessary-generics
  functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
  ): S̤t̤a̤m̤p̤ = js.native
  
  @JSImport("stampit", "methods")
  @js.native
  def methods[Obj](methods: MethodMap[Obj]*): StampType[Obj] = js.native
  
  @JSImport("stampit", "properties")
  @js.native
  def properties[Obj](objects: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "propertyDescriptors")
  @js.native
  def propertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "props")
  @js.native
  def props[Obj](objects: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "staticDeepProperties")
  @js.native
  def staticDeepProperties[Obj](deepStatics: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "staticProperties")
  @js.native
  def staticProperties[Obj](statics: PropertyMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "staticPropertyDescriptors")
  @js.native
  def staticPropertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = js.native
  
  @JSImport("stampit", "version")
  @js.native
  val version: String = js.native
  
  /**
    * @internal Chainables `Stamp` additionnal methods
    * @template Obj The object type that the `Stamp` will create.
    * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
    */
  @js.native
  trait Chainables[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends StObject {
    
    /**
      * Take in a variable number of functions and add them to the composers prototype as composers. **Chainable**.
      * @param functions Composer functions that will run in sequence while creating a new stamp from a list of composables.  The resulting stamp and the composables get passed to composers.
      */
    def composers(functions: Composer[S̤t̤a̤m̤p̤]*): S̤t̤a̤m̤p̤ = js.native
    def composers(functions: js.Array[Composer[S̤t̤a̤m̤p̤]]): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @param confs The object(s) containing metadata properties.
      */
    def conf(confs: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @param confs The object(s) containing metadata properties.
      */
    def configuration(confs: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @param deepConfs The object(s) containing metadata properties.
      */
    def deepConf(deepConfs: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @param deepConfs The object(s) containing metadata properties.
      */
    def deepConfiguration(deepConfs: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp. **Chainable**.
      * @param deepObjects The object(s) to deeply merge for each new object.
      */
    def deepProperties(deepObjects: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp. **Chainable**.
      * @param deepObjects The object(s) to deeply merge for each new object.
      */
    def deepProps(deepObjects: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @param deepStatics The object(s) containing static properties to be merged.
      */
    def deepStatics(deepStatics: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
      * @param functions Initializer functions used to create private data and privileged methods.
      */
    def init(functions: (Initializer[Obj, S̤t̤a̤m̤p̤])*): S̤t̤a̤m̤p̤ = js.native
    def init(functions: js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]]): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
      * @param functions Initializer functions used to create private data and privileged methods.
      */
    def initializers(functions: (Initializer[Obj, S̤t̤a̤m̤p̤])*): S̤t̤a̤m̤p̤ = js.native
    def initializers(functions: js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]]): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Add methods to the methods prototype. Creates and returns new Stamp. **Chainable**.
      * @template This The type to use for `this` within methods.
      * @param methods Object(s) containing map of method names and bodies for delegation.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def methods[This](methods: MethodMap[This]*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
      * @param objects Object(s) to shallow assign for each new object.
      */
    def properties(objects: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Apply ES5 property descriptors to object instances created by the new Stamp returned by the function and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
      * @param descriptors
      */
    def propertyDescriptors(descriptors: PropertyDescriptorMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
      * @param objects Object(s) to shallow assign for each new object.
      */
    def props(objects: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @param deepStatics The object(s) containing static properties to be merged.
      */
    def staticDeepProperties(deepStatics: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
      * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
      */
    def staticProperties(statics: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Apply ES5 property descriptors to a Stamp and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
      * @param descriptors
      */
    def staticPropertyDescriptors(descriptors: PropertyDescriptorMap*): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
      * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
      */
    def statics(statics: PropertyMap*): S̤t̤a̤m̤p̤ = js.native
  }
  
  /**
    * A function which creates a new `Stamp`s from a list of `Composable`s.
    * @template Obj The type of the object instance being produced by the `Stamp` or the type of the `Stamp` being created (when extending a `Stamp`.)
    */
  @js.native
  trait ComposeMethod extends StObject {
    
    /**
      * A function which creates a new `Stamp`s from a list of `Composable`s.
      * @template Obj The type of the object instance being created by the `Stamp` or the type of the `Stamp` being created (when extending a `Stamp`.)
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def apply[Obj](composables: Composable*): StampType[Obj] = js.native
    
    /** A function which creates a new `Stamp`s from a list of `Composable`s. */
    val compose: ComposeMethod = js.native
    
    /**
      * A shortcut method for stampit().composers()
      *
      * Take in a variable number of functions and add them to the composers prototype as composers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Composer functions that will run in sequence while creating a new stamp from a list of composables.  The resulting stamp and the composables get passed to composers.
      */
    def composers[Obj](functions: Composer[StampType[Obj]]*): StampType[Obj] = js.native
    def composers[Obj](functions: js.Array[Composer[StampType[Obj]]]): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().conf()
      *
      * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param confs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def conf[Obj](confs: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().configuration()
      *
      * Shallowly assign properties of Stamp arbitrary metadata and add them to a new stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param confs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def configuration[Obj](confs: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepConf()
      *
      * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepConfs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def deepConf[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepConfiguration()
      *
      * Deeply merge properties of Stamp arbitrary metadata and add them to a new Stamp and any future Stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepConfs The object(s) containing metadata properties
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def deepConfiguration[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepProperties()
      *
      * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepObjects The object(s) to deeply merge for each new object
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def deepProperties[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepProps()
      *
      * Take a variable number of objects and deeply merge them to any future created instance of the Stamp. Creates and returns a new Stamp.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepObjects The object(s) to deeply merge for each new object
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def deepProps[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().deepStatics()
      *
      * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepStatics The object(s) containing static properties to be merged
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def deepStatics[Obj](deepStatics: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().init()
      *
      * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Initializer functions used to create private data and privileged methods
      */
    def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
    ): S̤t̤a̤m̤p̤ = js.native
    def init[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
    ): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * A shortcut method for stampit().initializers()
      *
      * Take in a variable number of functions and add them to the initializers prototype as initializers. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param functions Initializer functions used to create private data and privileged methods
      */
    def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: (Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤])*
    ): S̤t̤a̤m̤p̤ = js.native
    def initializers[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](
      // tslint:disable-next-line: no-unnecessary-generics
    functions: js.Array[Initializer[StampObjectType[Obj], S̤t̤a̤m̤p̤]]
    ): S̤t̤a̤m̤p̤ = js.native
    
    /**
      * A shortcut method for stampit().methods()
      *
      * Add methods to the methods prototype. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @template This The type to use for `this` within methods.
      * @param methods Object(s) containing map of method names and bodies for delegation.
      */
    def methods[Obj](methods: MethodMap[Obj]*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().properties()
      *
      * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param objects Object(s) to shallow assign for each new object.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def properties[Obj](objects: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().propertyDescriptors()
      *
      * Apply ES5 property descriptors to object instances created by the new Stamp returned by the function and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param descriptors
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def propertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().props()
      *
      * Take a variable number of objects and shallow assign them to any future created instance of the Stamp. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param objects Object(s) to shallow assign for each new object.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def props[Obj](objects: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().staticDeepProperties()
      *
      * Deeply merge a variable number of objects and add them to a new stamp and any future stamp it composes. Creates and returns a new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param deepStatics The object(s) containing static properties to be merged
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def staticDeepProperties[Obj](deepStatics: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().statics()
      *
      * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def staticProperties[Obj](statics: PropertyMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().staticPropertyDescriptors()
      *
      * Apply ES5 property descriptors to a Stamp and any future Stamp it composes. Creates and returns a new stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param descriptors
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def staticPropertyDescriptors[Obj](descriptors: PropertyDescriptorMap*): StampType[Obj] = js.native
    
    /**
      * A shortcut method for stampit().staticProperties()
      *
      * Take n objects and add them to a new stamp and any future stamp it composes with. Creates and returns new Stamp. **Chainable**.
      * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
      * @param statics Object(s) containing map of property names and values to mixin into each new stamp.
      */
    // tslint:disable-next-line: no-unnecessary-generics
    def statics[Obj](statics: PropertyMap*): StampType[Obj] = js.native
    
    /** the version of the NPM `stampit` package. */
    val version: String = js.native
  }
  
  /**
    * A factory function to create plain object instances.
    * @template Obj The object type that the `Stamp` will create.
    */
  @js.native
  trait FactoryFunction[Obj] extends StObject {
    
    def apply(options: js.UndefOr[scala.Nothing], args: js.Any*): StampObjectType[Obj] = js.native
    def apply(options: PropertyMap, args: js.Any*): StampObjectType[Obj] = js.native
  }
  
  type MethodMap[This] = StringDictionary[(js.ThisFunction1[/* this */ This, /* repeated */ js.Any, js.Any]) | js.Object]
  
  /** @internal A plain old JavaScript object created by a `Stamp`. */
  type Pojo = js.Object
  
  // { [s: string]: any; }
  /** @internal Base type for all `properties`-like metadata. */
  // TODO: discriminate Array
  type PropertyMap = js.Object
  
  /**
    * @internal Chainables `Stamp` additionnal methods
    * @template Obj The object type that the `Stamp` will create.
    */
  type StampChainables[Obj] = Chainables[StampObjectType[Obj], StampType[Obj]]
  
  /**
    * @internal The type of the object produced by the `Stamp`.
    * @template Original The type (either a `Stamp` or a `ExtendedDescriptor`) to get the object type from.
    */
  type StampObjectType[Original] = Original | js.Any
  
  // { [s: string]: any; }
  /** @internal Signature common to every `Stamp`s. */
  @js.native
  trait StampSignature extends StObject {
    
    def apply(options: js.UndefOr[scala.Nothing], args: js.Any*): js.Any = js.native
    def apply(options: PropertyMap, args: js.Any*): js.Any = js.native
    
    var compose: ComposeMethod with (Descriptor[_, _]) = js.native
  }
  
  /**
    * @internal Extracts the `Stamp` type.
    * @template Original The type to extract the `Stamp` type from.
    */
  type StampType[Original] = (Stamp[js.Any | Original]) | Original | js.Any
  
  object stampit {
    
    /** A composable object (either a `Stamp` or a `ExtendedDescriptor`.) */
    type Composable = StampSignature | (ExtendedDescriptor[js.Any, js.Any])
    
    /**
      * A function used as `.composers` argument.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
      */
    type Composer[S̤t̤a̤m̤p̤ /* <: StampSignature */] = js.Function1[/* parameters */ ComposerParameters[S̤t̤a̤m̤p̤], Unit | S̤t̤a̤m̤p̤]
    
    /**
      * The parameters received by the current `.composers` function.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
      */
    @js.native
    trait ComposerParameters[S̤t̤a̤m̤p̤ /* <: StampSignature */] extends StObject {
      
      /** The list of composables the `Stamp` was just composed of. */
      var composables: js.Array[Composable] = js.native
      
      /** The result of the `Composable`s composition. */
      var stamp: S̤t̤a̤m̤p̤ = js.native
    }
    object ComposerParameters {
      
      @scala.inline
      def apply[S̤t̤a̤m̤p̤ /* <: StampSignature */](composables: js.Array[Composable], stamp: S̤t̤a̤m̤p̤): ComposerParameters[S̤t̤a̤m̤p̤] = {
        val __obj = js.Dynamic.literal(composables = composables.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[ComposerParameters[S̤t̤a̤m̤p̤]]
      }
      
      @scala.inline
      implicit class ComposerParametersMutableBuilder[Self <: ComposerParameters[_], S̤t̤a̤m̤p̤ /* <: StampSignature */] (val x: Self with ComposerParameters[S̤t̤a̤m̤p̤]) extends AnyVal {
        
        @scala.inline
        def setComposables(value: js.Array[Composable]): Self = StObject.set(x, "composables", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComposablesVarargs(value: Composable*): Self = StObject.set(x, "composables", js.Array(value :_*))
        
        @scala.inline
        def setStamp(value: S̤t̤a̤m̤p̤): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A `Stamp`'s metadata.
      * @template Obj The type of the object instance being produced by the `Stamp`.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
      */
    @js.native
    trait Descriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends StObject {
      
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
      def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](): Descriptor[Obj, S̤t̤a̤m̤p̤] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Descriptor[Obj, S̤t̤a̤m̤p̤]]
      }
      
      @scala.inline
      implicit class DescriptorMutableBuilder[Self <: Descriptor[_, _], Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] (val x: Self with (Descriptor[Obj, S̤t̤a̤m̤p̤])) extends AnyVal {
        
        @scala.inline
        def setComposers(value: js.Array[Composer[S̤t̤a̤m̤p̤]]): Self = StObject.set(x, "composers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComposersUndefined: Self = StObject.set(x, "composers", js.undefined)
        
        @scala.inline
        def setComposersVarargs(value: Composer[S̤t̤a̤m̤p̤]*): Self = StObject.set(x, "composers", js.Array(value :_*))
        
        @scala.inline
        def setConfiguration(value: PropertyMap): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
        
        @scala.inline
        def setDeepConfiguration(value: PropertyMap): Self = StObject.set(x, "deepConfiguration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeepConfigurationUndefined: Self = StObject.set(x, "deepConfiguration", js.undefined)
        
        @scala.inline
        def setDeepProperties(value: PropertyMap): Self = StObject.set(x, "deepProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeepPropertiesUndefined: Self = StObject.set(x, "deepProperties", js.undefined)
        
        @scala.inline
        def setInitializers(value: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])): Self = StObject.set(x, "initializers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitializersUndefined: Self = StObject.set(x, "initializers", js.undefined)
        
        @scala.inline
        def setInitializersVarargs(value: (Initializer[Obj, S̤t̤a̤m̤p̤])*): Self = StObject.set(x, "initializers", js.Array(value :_*))
        
        @scala.inline
        def setMethods(value: MethodMap[Obj]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
        
        @scala.inline
        def setProperties(value: PropertyMap): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        @scala.inline
        def setPropertyDescriptors(value: PropertyDescriptorMap): Self = StObject.set(x, "propertyDescriptors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertyDescriptorsUndefined: Self = StObject.set(x, "propertyDescriptors", js.undefined)
        
        @scala.inline
        def setStaticDeepProperties(value: PropertyMap): Self = StObject.set(x, "staticDeepProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStaticDeepPropertiesUndefined: Self = StObject.set(x, "staticDeepProperties", js.undefined)
        
        @scala.inline
        def setStaticProperties(value: PropertyMap): Self = StObject.set(x, "staticProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStaticPropertiesUndefined: Self = StObject.set(x, "staticProperties", js.undefined)
        
        @scala.inline
        def setStaticPropertyDescriptors(value: PropertyDescriptorMap): Self = StObject.set(x, "staticPropertyDescriptors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStaticPropertyDescriptorsUndefined: Self = StObject.set(x, "staticPropertyDescriptors", js.undefined)
      }
    }
    
    /**
      * A `stampit`'s metadata.
      * @template Obj The type of the object instance being produced by the `Stamp`.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` (when extending a `Stamp`.)
      */
    @js.native
    trait ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends Descriptor[Obj, S̤t̤a̤m̤p̤] {
      
      /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be copied by assignment. */
      var conf: js.UndefOr[PropertyMap] = js.native
      
      /** A set of options made available to the `Stamp` and its initializers during object instance creation. These will be deep merged. */
      var deepConf: js.UndefOr[PropertyMap] = js.native
      
      /** A set of properties that will be added to new object instances by deep property merge. */
      var deepProps: js.UndefOr[PropertyMap] = js.native
      
      /** A set of static properties that will be added to the `Stamp` by deep property merge. */
      var deepStatics: js.UndefOr[PropertyMap] = js.native
      
      /** An array of functions that will run in sequence while creating an object instance from a `Stamp`. `Stamp` details and arguments get passed to initializers. */
      var init: js.UndefOr[(Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])] = js.native
      
      // TODO: Add description
      var name: js.UndefOr[String] = js.native
      
      /** A set of properties that will be added to new object instances by assignment. */
      var props: js.UndefOr[PropertyMap] = js.native
      
      /** A set of static properties that will be copied by assignment to the `Stamp`. */
      var statics: js.UndefOr[PropertyMap] = js.native
    }
    object ExtendedDescriptor {
      
      @scala.inline
      def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](): ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤]]
      }
      
      @scala.inline
      implicit class ExtendedDescriptorMutableBuilder[Self <: ExtendedDescriptor[_, _], Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] (val x: Self with (ExtendedDescriptor[Obj, S̤t̤a̤m̤p̤])) extends AnyVal {
        
        @scala.inline
        def setConf(value: PropertyMap): Self = StObject.set(x, "conf", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConfUndefined: Self = StObject.set(x, "conf", js.undefined)
        
        @scala.inline
        def setDeepConf(value: PropertyMap): Self = StObject.set(x, "deepConf", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeepConfUndefined: Self = StObject.set(x, "deepConf", js.undefined)
        
        @scala.inline
        def setDeepProps(value: PropertyMap): Self = StObject.set(x, "deepProps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeepPropsUndefined: Self = StObject.set(x, "deepProps", js.undefined)
        
        @scala.inline
        def setDeepStatics(value: PropertyMap): Self = StObject.set(x, "deepStatics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeepStaticsUndefined: Self = StObject.set(x, "deepStatics", js.undefined)
        
        @scala.inline
        def setInit(value: (Initializer[Obj, S̤t̤a̤m̤p̤]) | (js.Array[Initializer[Obj, S̤t̤a̤m̤p̤]])): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
        
        @scala.inline
        def setInitVarargs(value: (Initializer[Obj, S̤t̤a̤m̤p̤])*): Self = StObject.set(x, "init", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setProps(value: PropertyMap): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
        
        @scala.inline
        def setStatics(value: PropertyMap): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
      }
    }
    
    /**
      * A function used as `.initializers` argument.
      * @template Obj The type of the object instance being produced by the `Stamp`.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
      */
    type Initializer[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] = js.ThisFunction2[
        /* this */ Obj, 
        /*_propertyMap*/ /* options */ js.Any, 
        /* context */ InitializerContext[Obj, S̤t̤a̤m̤p̤], 
        Unit | Obj
      ]
    
    /**
      * The `Initializer` function context.
      * @template Obj The type of the object instance being produced by the `Stamp`.
      * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
      */
    @js.native
    trait InitializerContext[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] extends StObject {
      
      /** An array of the arguments passed into the `Stamp`, including the options argument. */
      // ! above description from the specification is obscure
      var args: js.Array[_] = js.native
      
      /** The object instance being produced by the `Stamp`. If the initializer returns a value other than `undefined`, it replaces the instance. */
      var instance: Obj = js.native
      
      /** A reference to the `Stamp` producing the instance. */
      var stamp: S̤t̤a̤m̤p̤ = js.native
    }
    object InitializerContext {
      
      @scala.inline
      def apply[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */](args: js.Array[_], instance: Obj, stamp: S̤t̤a̤m̤p̤): InitializerContext[Obj, S̤t̤a̤m̤p̤] = {
        val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[InitializerContext[Obj, S̤t̤a̤m̤p̤]]
      }
      
      @scala.inline
      implicit class InitializerContextMutableBuilder[Self <: InitializerContext[_, _], Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] (val x: Self with (InitializerContext[Obj, S̤t̤a̤m̤p̤])) extends AnyVal {
        
        @scala.inline
        def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
        
        @scala.inline
        def setInstance(value: Obj): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStamp(value: S̤t̤a̤m̤p̤): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * @internal Checks that a type is a ExtendedDescriptor (except `any` and `unknown`).
      * @template Type A type to check if a ExtendedDescriptor.
      */
    // TODO: Improve test by checking the type of common keys
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.stampit.stampitBooleans.`false`
      - typingsSlinky.stampit.stampitBooleans.`true`
    */
    trait IsADescriptor[Type] extends StObject
    
    /**
      * A factory function to create plain object instances.
      *
      * It also has a `.compose()` method which is a copy of the `ComposeMethod` function and a `.compose` accessor to its `Descriptor`.
      * @template Obj The object type that the `Stamp` will create.
      */
    @js.native
    trait Stamp[Obj]
      extends FactoryFunction[Obj]
         with Chainables[StampObjectType[Obj], StampType[Obj]]
         with StampSignature {
      
      /* InferMemberOverrides */
      override def apply(options: js.UndefOr[scala.Nothing], args: js.Any*): StampObjectType[Obj] with js.Any = js.native
      /* InferMemberOverrides */
      override def apply(options: PropertyMap, args: js.Any*): StampObjectType[Obj] with js.Any = js.native
      
      /**
        * A function which creates a new `Stamp`s from a list of `Composable`s.
        * @template Obj The type of the object instance being produced by the `Stamp`. or the type of the `Stamp` being created.
        */
      @JSName("compose")
      var compose_Stamp: ComposeMethod with (Descriptor[StampObjectType[Obj], Stamp[StampObjectType[Obj]]]) = js.native
      
      def create(options: js.UndefOr[scala.Nothing], args: js.Any*): StampObjectType[Obj] = js.native
      /** Just like calling stamp(), stamp.create() invokes the stamp and returns a new instance. */
      def create(options: PropertyMap, args: js.Any*): StampObjectType[Obj] = js.native
      /** Just like calling stamp(), stamp.create() invokes the stamp and returns a new instance. */
      @JSName("create")
      var create_Original: FactoryFunction[Obj] = js.native
    }
  }
}
