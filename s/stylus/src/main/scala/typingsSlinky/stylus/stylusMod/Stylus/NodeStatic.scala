package typingsSlinky.stylus.stylusMod.Stylus

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.stylus.TypeofClassHSLA
import typingsSlinky.stylus.TypeofClassRGBA
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Arguments
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Atblock
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Atrule
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.BinOp
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Block
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Call
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Charset
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Comment
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Each
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Expression
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Extend
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Function
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Group
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Ident
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.If
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Import
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Keyframes
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Literal
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Media
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Member
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Namespace
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Node
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Null
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Object
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Params
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Property
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Query
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.QueryExpr
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.QueryList
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Return
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Root
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Selector
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Ternary
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.UnaryOp
import typingsSlinky.stylus.stylusMod.Stylus.Nodes.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStatic extends js.Object {
  var Arguments: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Arguments]
  var Atblock: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Atblock]
  var Atrule: Instantiable1[/* type */ String, typingsSlinky.stylus.stylusMod.Stylus.Nodes.Atrule]
  var BinOp: Instantiable3[
    /* op */ String, 
    /* left */ Expression, 
    /* right */ Expression, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.BinOp
  ]
  var Block: Instantiable1[
    /* parent */ typingsSlinky.stylus.stylusMod.Stylus.Nodes.Block, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Block
  ]
  var Boolean: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Boolean]
  var Call: Instantiable2[
    /* name */ String, 
    /* args */ Expression, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Call
  ]
  var Charset: Instantiable1[/* val */ String, typingsSlinky.stylus.stylusMod.Stylus.Nodes.Charset]
  var Comment: Instantiable3[
    /* str */ String, 
    /* suppress */ Boolean, 
    /* inline */ Boolean, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Comment
  ]
  var Each: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Each]
  var Expression: Instantiable1[/* isList */ Boolean, typingsSlinky.stylus.stylusMod.Stylus.Nodes.Expression]
  var Extend: Instantiable1[
    /* selectors */ js.Array[Selector], 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Extend
  ]
  var Function: Instantiable3[
    /* name */ String, 
    /* params */ Params, 
    /* body */ Block, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Function
  ]
  var Group: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Group]
  var HSLA: TypeofClassHSLA
  var Ident: Instantiable2[/* name */ String, /* val */ Node, typingsSlinky.stylus.stylusMod.Stylus.Nodes.Ident]
  var If: Instantiable2[
    /* cond */ Expression, 
    /* negate */ Boolean, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.If
  ]
  var Import: Instantiable1[/* path */ Expression, typingsSlinky.stylus.stylusMod.Stylus.Nodes.Import]
  var Keyframes: Instantiable1[/* segs */ js.Array[Node], typingsSlinky.stylus.stylusMod.Stylus.Nodes.Keyframes]
  var Literal: Instantiable1[/* str */ String, typingsSlinky.stylus.stylusMod.Stylus.Nodes.Literal]
  var Media: Instantiable1[/* val */ String, typingsSlinky.stylus.stylusMod.Stylus.Nodes.Media]
  var Member: Instantiable2[
    /* left */ Node, 
    /* right */ Node, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Member
  ]
  var Namespace: Instantiable2[
    /* val */ String, 
    /* prefix */ String, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Namespace
  ]
  var Node: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Node]
  var Null: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Null]
  var Object: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Object]
  var Params: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Params]
  var Property: Instantiable2[
    /* segs */ js.Array[Node], 
    /* expr */ Expression, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Property
  ]
  var Query: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Query]
  var QueryExpr: Instantiable1[/* segs */ js.Array[Node], typingsSlinky.stylus.stylusMod.Stylus.Nodes.QueryExpr]
  var QueryList: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.QueryList]
  var RGBA: TypeofClassRGBA
  var Return: Instantiable1[/* expr */ Expression, typingsSlinky.stylus.stylusMod.Stylus.Nodes.Return]
  var Root: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Root]
  var Selector: Instantiable1[/* segs */ js.Array[Node], typingsSlinky.stylus.stylusMod.Stylus.Nodes.Selector]
  var String: Instantiable1[/* val */ java.lang.String, typingsSlinky.stylus.stylusMod.Stylus.Nodes.String]
  var Ternary: Instantiable3[
    /* op */ String, 
    /* trueExpr */ Expression, 
    /* falseExpr */ Expression, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Ternary
  ]
  var UnaryOp: Instantiable2[
    /* op */ String, 
    /* expr */ Expression, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.UnaryOp
  ]
  var Unit: Instantiable2[
    /* val */ Double, 
    /* type */ String, 
    typingsSlinky.stylus.stylusMod.Stylus.Nodes.Unit
  ]
  var `false`: typingsSlinky.stylus.stylusMod.Stylus.Nodes.Boolean
  var `null`: Null
  var `true`: typingsSlinky.stylus.stylusMod.Stylus.Nodes.Boolean
}

object NodeStatic {
  @scala.inline
  def apply(
    Arguments: Instantiable0[Arguments],
    Atblock: Instantiable0[Atblock],
    Atrule: Instantiable1[/* type */ String, Atrule],
    BinOp: Instantiable3[/* op */ String, /* left */ Expression, /* right */ Expression, BinOp],
    Block: Instantiable1[/* parent */ Block, Block],
    Boolean: Instantiable0[typingsSlinky.stylus.stylusMod.Stylus.Nodes.Boolean],
    Call: Instantiable2[/* name */ String, /* args */ Expression, Call],
    Charset: Instantiable1[/* val */ String, Charset],
    Comment: Instantiable3[/* str */ String, /* suppress */ Boolean, /* inline */ Boolean, Comment],
    Each: Instantiable0[Each],
    Expression: Instantiable1[/* isList */ Boolean, Expression],
    Extend: Instantiable1[/* selectors */ js.Array[Selector], Extend],
    Function: Instantiable3[/* name */ String, /* params */ Params, /* body */ Block, Function],
    Group: Instantiable0[Group],
    HSLA: TypeofClassHSLA,
    Ident: Instantiable2[/* name */ String, /* val */ Node, Ident],
    If: Instantiable2[/* cond */ Expression, /* negate */ Boolean, If],
    Import: Instantiable1[/* path */ Expression, Import],
    Keyframes: Instantiable1[/* segs */ js.Array[Node], Keyframes],
    Literal: Instantiable1[/* str */ String, Literal],
    Media: Instantiable1[/* val */ String, Media],
    Member: Instantiable2[/* left */ Node, /* right */ Node, Member],
    Namespace: Instantiable2[/* val */ String, /* prefix */ String, Namespace],
    Node: Instantiable0[Node],
    Null: Instantiable0[Null],
    Object: Instantiable0[Object],
    Params: Instantiable0[Params],
    Property: Instantiable2[/* segs */ js.Array[Node], /* expr */ Expression, Property],
    Query: Instantiable0[Query],
    QueryExpr: Instantiable1[/* segs */ js.Array[Node], QueryExpr],
    QueryList: Instantiable0[QueryList],
    RGBA: TypeofClassRGBA,
    Return: Instantiable1[/* expr */ Expression, Return],
    Root: Instantiable0[Root],
    Selector: Instantiable1[/* segs */ js.Array[Node], Selector],
    String: Instantiable1[/* val */ String, typingsSlinky.stylus.stylusMod.Stylus.Nodes.String],
    Ternary: Instantiable3[/* op */ String, /* trueExpr */ Expression, /* falseExpr */ Expression, Ternary],
    UnaryOp: Instantiable2[/* op */ String, /* expr */ Expression, UnaryOp],
    Unit: Instantiable2[/* val */ Double, /* type */ String, Unit],
    `false`: typingsSlinky.stylus.stylusMod.Stylus.Nodes.Boolean,
    `null`: Null,
    `true`: typingsSlinky.stylus.stylusMod.Stylus.Nodes.Boolean
  ): NodeStatic = {
    val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Atblock = Atblock.asInstanceOf[js.Any], Atrule = Atrule.asInstanceOf[js.Any], BinOp = BinOp.asInstanceOf[js.Any], Block = Block.asInstanceOf[js.Any], Boolean = Boolean.asInstanceOf[js.Any], Call = Call.asInstanceOf[js.Any], Charset = Charset.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Each = Each.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], HSLA = HSLA.asInstanceOf[js.Any], Ident = Ident.asInstanceOf[js.Any], If = If.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], Keyframes = Keyframes.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], Member = Member.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Null = Null.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], Params = Params.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], QueryExpr = QueryExpr.asInstanceOf[js.Any], QueryList = QueryList.asInstanceOf[js.Any], RGBA = RGBA.asInstanceOf[js.Any], Return = Return.asInstanceOf[js.Any], Root = Root.asInstanceOf[js.Any], Selector = Selector.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], Ternary = Ternary.asInstanceOf[js.Any], UnaryOp = UnaryOp.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeStatic]
  }
}

