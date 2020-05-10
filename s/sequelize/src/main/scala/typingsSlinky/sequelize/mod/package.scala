package typingsSlinky.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyFindOptions = typingsSlinky.sequelize.mod.FindOptions[js.Any]
  /**
    * A hash of attributes to describe your search, accepting any field names. See `WhereOptions` for details.
    */
  type AnyWhereOptions = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.sequelize.mod.WhereOptions[js.Any]] | js.Object]
  /**
    * Options for Association Scope
    *
    * @see AssociationOptionsManyToMany
    */
  type AssociationScope = /**
    * The name of the column that will be used for the associated scope and it's value
    */
  org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The createAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    // setRole...
    *    createRole: Sequelize.BelongsToCreateAssociationMixin<RoleAttributes>;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToCreateAssociationMixin[TAttributes, TInstance] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToCreateAssociationMixinOptions | typingsSlinky.sequelize.mod.CreateOptions | typingsSlinky.sequelize.mod.BelongsToSetAssociationMixinOptions
    ], 
    typingsSlinky.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttrib>, UserAttrib {
    *    getRole: Sequelize.BelongsToGetAssociationMixin<RoleInstance>;
    *    // setRole...
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToGetAssociationMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.sequelize.mod.BelongsToGetAssociationMixinOptions], 
    typingsSlinky.bluebird.mod.^[TInstance | scala.Null]
  ]
  /**
    * The addAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    addRole: Sequelize.BelongsToManyAddAssociationMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyAddAssociationMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToManyAddAssociationMixinOptions | typingsSlinky.sequelize.mod.AnyFindOptions | typingsSlinky.sequelize.mod.BulkCreateOptions | typingsSlinky.sequelize.mod.InstanceUpdateOptions | typingsSlinky.sequelize.mod.InstanceDestroyOptions | typingsSlinky.sequelize.AnonThrough[TJoinTableAttributes]
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The addAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    addRoles: Sequelize.BelongsToManyAddAssociationsMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyAddAssociationsMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToManyAddAssociationsMixinOptions | typingsSlinky.sequelize.mod.AnyFindOptions | typingsSlinky.sequelize.mod.BulkCreateOptions | typingsSlinky.sequelize.mod.InstanceUpdateOptions | typingsSlinky.sequelize.mod.InstanceDestroyOptions | typingsSlinky.sequelize.AnonThrough[TJoinTableAttributes]
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The countAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    countRoles: Sequelize.BelongsToManyCountAssociationsMixin;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyCountAssociationsMixin = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.sequelize.mod.BelongsToManyCountAssociationsMixinOptions], 
    typingsSlinky.bluebird.mod.^[scala.Double]
  ]
  /**
    * The createAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    createRole: Sequelize.BelongsToManyCreateAssociationMixin<RoleAttributes, UserRoleAttributes>;
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyCreateAssociationMixin[TAttributes, TInstance, TJoinTableAttributes] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToManyCreateAssociationMixinOptions | typingsSlinky.sequelize.mod.CreateOptions | typingsSlinky.sequelize.AnonThrough[TJoinTableAttributes]
    ], 
    typingsSlinky.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    getRoles: Sequelize.BelongsToManyGetAssociationsMixin<RoleInstance>;
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyGetAssociationsMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.sequelize.mod.BelongsToManyGetAssociationsMixinOptions], 
    typingsSlinky.bluebird.mod.^[js.Array[TInstance]]
  ]
  /**
    * The hasAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    hasRole: Sequelize.BelongsToManyHasAssociationMixin<RoleInstance, RoleId>;
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyHasAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* target */ TInstance | TInstancePrimaryKey, 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToManyHasAssociationMixinOptions | typingsSlinky.sequelize.mod.BelongsToManyGetAssociationsMixinOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles
    *    // hasRole...
    *    hasRoles: Sequelize.BelongsToManyHasAssociationsMixin<RoleInstance, RoleId>;
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyHasAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* targets */ js.Array[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToManyHasAssociationsMixinOptions | typingsSlinky.sequelize.mod.BelongsToManyGetAssociationsMixinOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    removeRole: Sequelize.BelongsToManyRemoveAssociationMixin<RoleInstance, RoleId>;
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyRemoveAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociated */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToManyRemoveAssociationMixinOptions | typingsSlinky.sequelize.mod.InstanceDestroyOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The removeAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    removeRoles: Sequelize.BelongsToManyRemoveAssociationsMixin<RoleInstance, RoleId>;
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyRemoveAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociateds */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToManyRemoveAssociationsMixinOptions | typingsSlinky.sequelize.mod.InstanceDestroyOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    setRoles: Sequelize.BelongsToManySetAssociationsMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManySetAssociationsMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToManySetAssociationsMixinOptions | typingsSlinky.sequelize.mod.AnyFindOptions | typingsSlinky.sequelize.mod.BulkCreateOptions | typingsSlinky.sequelize.mod.InstanceUpdateOptions | typingsSlinky.sequelize.mod.InstanceDestroyOptions | typingsSlinky.sequelize.AnonThrough[TJoinTableAttributes]
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    setRole: Sequelize.BelongsToSetAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToSetAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.BelongsToSetAssociationMixinOptions | typingsSlinky.sequelize.mod.InstanceSaveOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  type DataTypeBoolean = typingsSlinky.sequelize.mod.DataTypeAbstract
  type DataTypeDateOnly = typingsSlinky.sequelize.mod.DataTypeAbstract
  type DataTypeHStore = typingsSlinky.sequelize.mod.DataTypeAbstract
  type DataTypeJSONB = typingsSlinky.sequelize.mod.DataTypeAbstract
  type DataTypeJSONType = typingsSlinky.sequelize.mod.DataTypeAbstract
  type DataTypeNow = typingsSlinky.sequelize.mod.DataTypeAbstract
  type DataTypeTime = typingsSlinky.sequelize.mod.DataTypeAbstract
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineAttributes = /**
    * The description of a database column
    */
  org.scalablytyped.runtime.StringDictionary[
    java.lang.String | typingsSlinky.sequelize.mod.DataTypeAbstract | typingsSlinky.sequelize.mod.DefineAttributeColumnOptions
  ]
  /**
    * Interface for getterMethods in DefineOptions
    *
    * @see DefineOptions
    */
  type DefineGetterMethodsOptions = org.scalablytyped.runtime.StringDictionary[js.Function0[js.Any]]
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineModelAttributes[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string | sequelize.sequelize.DataTypeAbstract | sequelize.sequelize.DefineAttributeColumnOptions}
    */ typingsSlinky.sequelize.sequelizeStrings.DefineModelAttributes with org.scalablytyped.runtime.TopLevel[js.Any]
  /**
    * Interface for Define Scope Options
    *
    * @see DefineOptions
    */
  type DefineScopeOptions = /**
    * Name of the scope and it's query
    */
  org.scalablytyped.runtime.StringDictionary[typingsSlinky.sequelize.mod.AnyFindOptions | js.Function]
  /**
    * Interface for setterMethods in DefineOptions
    *
    * @see DefineOptions
    */
  type DefineSetterMethodsOptions = org.scalablytyped.runtime.StringDictionary[js.Function1[/* val */ js.Any, scala.Unit]]
  /**
    * Shortcut for types used in FindOptions.attributes
    */
  type FindOptionsAttributesArray = js.Array[
    java.lang.String | typingsSlinky.sequelize.mod.literal | (js.Tuple2[
      java.lang.String | typingsSlinky.sequelize.mod.cast | typingsSlinky.sequelize.mod.fn | typingsSlinky.sequelize.mod.literal, 
      java.lang.String
    ]) | typingsSlinky.sequelize.mod.fn | typingsSlinky.sequelize.mod.cast
  ]
  /**
    * Shortcut for order type in FindOptions.attributes
    */
  type FindOptionsOrderArray = js.Array[
    java.lang.String | scala.Double | (typingsSlinky.sequelize.mod.Model[js.Any, js.Any, js.Any]) | typingsSlinky.sequelize.AnonAs | typingsSlinky.sequelize.mod.fn
  ]
  /**
    * GetTableName Options
    */
  type GetTableNameOptions = typingsSlinky.sequelize.mod.LoggingOptions
  /**
    * The addAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    addRole: Sequelize.HasManyAddAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyAddAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasManyAddAssociationMixinOptions | typingsSlinky.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The addAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    addRoles: Sequelize.HasManyAddAssociationsMixin<RoleInstance, RoleId>;
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyAddAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasManyAddAssociationsMixinOptions | typingsSlinky.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The countAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    countRoles: Sequelize.HasManyCountAssociationsMixin;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyCountAssociationsMixin = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.sequelize.mod.HasManyCountAssociationsMixinOptions], 
    typingsSlinky.bluebird.mod.^[scala.Double]
  ]
  /**
    * The createAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    createRole: Sequelize.HasManyCreateAssociationMixin<RoleAttributes>;
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyCreateAssociationMixin[TAttributes, TInstance] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasManyCreateAssociationMixinOptions | typingsSlinky.sequelize.mod.CreateOptions
    ], 
    typingsSlinky.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    getRoles: Sequelize.HasManyGetAssociationsMixin<RoleInstance>;
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyGetAssociationsMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.sequelize.mod.HasManyGetAssociationsMixinOptions], 
    typingsSlinky.bluebird.mod.^[js.Array[TInstance]]
  ]
  /**
    * The hasAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    hasRole: Sequelize.HasManyHasAssociationMixin<RoleInstance, RoleId>;
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyHasAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* target */ TInstance | TInstancePrimaryKey, 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasManyHasAssociationMixinOptions | typingsSlinky.sequelize.mod.HasManyGetAssociationsMixinOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles
    *    // hasRole...
    *    hasRoles: Sequelize.HasManyHasAssociationsMixin<RoleInstance, RoleId>;
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyHasAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* targets */ js.Array[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasManyHasAssociationsMixinOptions | typingsSlinky.sequelize.mod.HasManyGetAssociationsMixinOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    removeRole: Sequelize.HasManyRemoveAssociationMixin<RoleInstance, RoleId>;
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyRemoveAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociated */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasManyRemoveAssociationMixinOptions | typingsSlinky.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The removeAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    removeRoles: Sequelize.HasManyRemoveAssociationsMixin<RoleInstance, RoleId>;
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyRemoveAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociateds */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasManyRemoveAssociationsMixinOptions | typingsSlinky.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    setRoles: Sequelize.HasManySetAssociationsMixin<RoleInstance, RoleId>;
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManySetAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasManySetAssociationsMixinOptions | typingsSlinky.sequelize.mod.AnyFindOptions | typingsSlinky.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The createAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    // setRole...
    *    createRole: Sequelize.HasOneCreateAssociationMixin<RoleAttributes>;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneCreateAssociationMixin[TAttributes] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasOneCreateAssociationMixinOptions | typingsSlinky.sequelize.mod.HasOneSetAssociationMixinOptions | typingsSlinky.sequelize.mod.CreateOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The getAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttrib>, UserAttrib {
    *    getRole: Sequelize.HasOneGetAssociationMixin<RoleInstance>;
    *    // setRole...
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneGetAssociationMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.sequelize.mod.HasOneGetAssociationMixinOptions], 
    typingsSlinky.bluebird.mod.^[TInstance | scala.Null]
  ]
  /**
    * The setAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    setRole: Sequelize.HasOneSetAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneSetAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsSlinky.sequelize.mod.HasOneSetAssociationMixinOptions | typingsSlinky.sequelize.mod.HasOneGetAssociationMixinOptions | typingsSlinky.sequelize.mod.InstanceSaveOptions
    ], 
    typingsSlinky.bluebird.mod.^[scala.Unit]
  ]
  /**
    * Models contains Model instances associated to their name
    */
  type Models = org.scalablytyped.runtime.StringDictionary[typingsSlinky.sequelize.mod.Model[js.Any, js.Any, js.Any]]
  type ModelsHashInterface = org.scalablytyped.runtime.StringDictionary[typingsSlinky.sequelize.mod.Model[js.Any, js.Any, js.Any]]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  /**
    * A hash of attributes to describe your search. See above for examples.
    *
    * We did put Object in the end, because there where query might be a JSON Blob. It cripples a bit the
    * typesafety, but there is no way to pass the tests if we just remove it.
    */
  type Primitives = java.lang.String | scala.Double | scala.Boolean | typingsSlinky.node.Buffer
  type TransactionIsolationLevel = typingsSlinky.sequelize.mod.TransactionIsolationLevelReadUncommitted | typingsSlinky.sequelize.mod.TransactionIsolationLevelReadCommitted | typingsSlinky.sequelize.mod.TransactionIsolationLevelRepeatableRead | typingsSlinky.sequelize.mod.TransactionIsolationLevelSerializable
  type TransactionIsolationLevelReadCommitted = typingsSlinky.sequelize.sequelizeStrings.`READ COMMITTED`
  type TransactionIsolationLevelReadUncommitted = typingsSlinky.sequelize.sequelizeStrings.`READ UNCOMMITTED`
  type TransactionIsolationLevelRepeatableRead = typingsSlinky.sequelize.sequelizeStrings.`REPEATABLE READ`
  type TransactionIsolationLevelSerializable = typingsSlinky.sequelize.sequelizeStrings.SERIALIZABLE
  type TransactionLockLevel = typingsSlinky.sequelize.mod.TransactionLockLevelUpdate | typingsSlinky.sequelize.mod.TransactionLockLevelShare | typingsSlinky.sequelize.mod.TransactionLockLevelKeyShare | typingsSlinky.sequelize.mod.TransactionLockLevelNoKeyUpdate
  type TransactionLockLevelKeyShare = typingsSlinky.sequelize.sequelizeStrings.`KEY SHARE`
  type TransactionLockLevelNoKeyUpdate = typingsSlinky.sequelize.sequelizeStrings.`NO KEY UPDATE`
  type TransactionLockLevelShare = typingsSlinky.sequelize.sequelizeStrings.SHARE
  type TransactionLockLevelUpdate = typingsSlinky.sequelize.sequelizeStrings.UPDATE
  type TransactionType = typingsSlinky.sequelize.mod.TransactionTypeDeferred | typingsSlinky.sequelize.mod.TransactionTypeImmediate | typingsSlinky.sequelize.mod.TransactionTypeExclusive
  type TransactionTypeDeferred = typingsSlinky.sequelize.sequelizeStrings.DEFERRED
  type TransactionTypeExclusive = typingsSlinky.sequelize.sequelizeStrings.EXCLUSIVE
  type TransactionTypeImmediate = typingsSlinky.sequelize.sequelizeStrings.IMMEDIATE
  type WhereOptions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? sequelize.sequelize.Primitives | std.Array<sequelize.sequelize.Primitives> | sequelize.sequelize.WhereLogic | T[P] extends sequelize.sequelize.Primitives? null : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias sequelize.sequelize.WhereOptions<T[P]> * / object | sequelize.sequelize.col | sequelize.sequelize.and | sequelize.sequelize.or | sequelize.sequelize.WhereGeometryOptions | sequelize.sequelize.WhereNested | sequelize.sequelize.where | null}
    */ typingsSlinky.sequelize.sequelizeStrings.WhereOptions with org.scalablytyped.runtime.TopLevel[T]
}
