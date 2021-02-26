package typingsSlinky.typeorm

import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.DateConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.columnTypesMod.WithPrecisionColumnType
    - typingsSlinky.typeorm.columnTypesMod.WithLengthColumnType
    - typingsSlinky.typeorm.columnTypesMod.WithWidthColumnType
    - typingsSlinky.typeorm.columnTypesMod.SpatialColumnType
    - typingsSlinky.typeorm.columnTypesMod.SimpleColumnType
    - typingsSlinky.std.BooleanConstructor
    - typingsSlinky.std.DateConstructor
    - typingsSlinky.std.NumberConstructor
    - typingsSlinky.std.StringConstructor
  */
  type ColumnType = _ColumnType | BooleanConstructor | DateConstructor | NumberConstructor | StringConstructor
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.typeormStrings.int
    - typingsSlinky.typeorm.typeormStrings.int2
    - typingsSlinky.typeorm.typeormStrings.int4
    - typingsSlinky.typeorm.typeormStrings.int8
    - typingsSlinky.typeorm.typeormStrings.integer
    - typingsSlinky.typeorm.typeormStrings.tinyint
    - typingsSlinky.typeorm.typeormStrings.smallint
    - typingsSlinky.typeorm.typeormStrings.mediumint
    - typingsSlinky.typeorm.typeormStrings.bigint
    - typingsSlinky.typeorm.typeormStrings.dec
    - typingsSlinky.typeorm.typeormStrings.decimal
    - typingsSlinky.typeorm.typeormStrings.smalldecimal
    - typingsSlinky.typeorm.typeormStrings.fixed
    - typingsSlinky.typeorm.typeormStrings.numeric
    - typingsSlinky.typeorm.typeormStrings.number
    - typingsSlinky.typeorm.typeormStrings.uuid
  */
  trait PrimaryGeneratedColumnType extends StObject
  object PrimaryGeneratedColumnType {
    
    @scala.inline
    def bigint: typingsSlinky.typeorm.typeormStrings.bigint = "bigint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.bigint]
    
    @scala.inline
    def dec: typingsSlinky.typeorm.typeormStrings.dec = "dec".asInstanceOf[typingsSlinky.typeorm.typeormStrings.dec]
    
    @scala.inline
    def decimal: typingsSlinky.typeorm.typeormStrings.decimal = "decimal".asInstanceOf[typingsSlinky.typeorm.typeormStrings.decimal]
    
    @scala.inline
    def fixed: typingsSlinky.typeorm.typeormStrings.fixed = "fixed".asInstanceOf[typingsSlinky.typeorm.typeormStrings.fixed]
    
    @scala.inline
    def int: typingsSlinky.typeorm.typeormStrings.int = "int".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int]
    
    @scala.inline
    def int2: typingsSlinky.typeorm.typeormStrings.int2 = "int2".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int2]
    
    @scala.inline
    def int4: typingsSlinky.typeorm.typeormStrings.int4 = "int4".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int4]
    
    @scala.inline
    def int8: typingsSlinky.typeorm.typeormStrings.int8 = "int8".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int8]
    
    @scala.inline
    def integer: typingsSlinky.typeorm.typeormStrings.integer = "integer".asInstanceOf[typingsSlinky.typeorm.typeormStrings.integer]
    
    @scala.inline
    def mediumint: typingsSlinky.typeorm.typeormStrings.mediumint = "mediumint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.mediumint]
    
    @scala.inline
    def number: typingsSlinky.typeorm.typeormStrings.number = "number".asInstanceOf[typingsSlinky.typeorm.typeormStrings.number]
    
    @scala.inline
    def numeric: typingsSlinky.typeorm.typeormStrings.numeric = "numeric".asInstanceOf[typingsSlinky.typeorm.typeormStrings.numeric]
    
    @scala.inline
    def smalldecimal: typingsSlinky.typeorm.typeormStrings.smalldecimal = "smalldecimal".asInstanceOf[typingsSlinky.typeorm.typeormStrings.smalldecimal]
    
    @scala.inline
    def smallint: typingsSlinky.typeorm.typeormStrings.smallint = "smallint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.smallint]
    
    @scala.inline
    def tinyint: typingsSlinky.typeorm.typeormStrings.tinyint = "tinyint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.tinyint]
    
    @scala.inline
    def uuid: typingsSlinky.typeorm.typeormStrings.uuid = "uuid".asInstanceOf[typingsSlinky.typeorm.typeormStrings.uuid]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.typeormStrings.`simple-array`
    - typingsSlinky.typeorm.typeormStrings.`simple-json`
    - typingsSlinky.typeorm.typeormStrings.`simple-enum`
    - typingsSlinky.typeorm.typeormStrings.int2
    - typingsSlinky.typeorm.typeormStrings.integer
    - typingsSlinky.typeorm.typeormStrings.int4
    - typingsSlinky.typeorm.typeormStrings.int8
    - typingsSlinky.typeorm.typeormStrings.int64
    - typingsSlinky.typeorm.typeormStrings.`unsigned big int`
    - typingsSlinky.typeorm.typeormStrings.float
    - typingsSlinky.typeorm.typeormStrings.float4
    - typingsSlinky.typeorm.typeormStrings.float8
    - typingsSlinky.typeorm.typeormStrings.smallmoney
    - typingsSlinky.typeorm.typeormStrings.money
    - typingsSlinky.typeorm.typeormStrings.boolean
    - typingsSlinky.typeorm.typeormStrings.bool
    - typingsSlinky.typeorm.typeormStrings.tinyblob
    - typingsSlinky.typeorm.typeormStrings.tinytext
    - typingsSlinky.typeorm.typeormStrings.mediumblob
    - typingsSlinky.typeorm.typeormStrings.mediumtext
    - typingsSlinky.typeorm.typeormStrings.blob
    - typingsSlinky.typeorm.typeormStrings.text
    - typingsSlinky.typeorm.typeormStrings.ntext
    - typingsSlinky.typeorm.typeormStrings.citext
    - typingsSlinky.typeorm.typeormStrings.hstore
    - typingsSlinky.typeorm.typeormStrings.longblob
    - typingsSlinky.typeorm.typeormStrings.longtext
    - typingsSlinky.typeorm.typeormStrings.alphanum
    - typingsSlinky.typeorm.typeormStrings.shorttext
    - typingsSlinky.typeorm.typeormStrings.bytes
    - typingsSlinky.typeorm.typeormStrings.bytea
    - typingsSlinky.typeorm.typeormStrings.long
    - typingsSlinky.typeorm.typeormStrings.raw
    - typingsSlinky.typeorm.typeormStrings.`long raw`
    - typingsSlinky.typeorm.typeormStrings.bfile
    - typingsSlinky.typeorm.typeormStrings.clob
    - typingsSlinky.typeorm.typeormStrings.nclob
    - typingsSlinky.typeorm.typeormStrings.image
    - typingsSlinky.typeorm.typeormStrings.timetz
    - typingsSlinky.typeorm.typeormStrings.timestamptz
    - typingsSlinky.typeorm.typeormStrings.`timestamp with local time zone`
    - typingsSlinky.typeorm.typeormStrings.smalldatetime
    - typingsSlinky.typeorm.typeormStrings.date
    - typingsSlinky.typeorm.typeormStrings.`interval year to month`
    - typingsSlinky.typeorm.typeormStrings.`interval day to second`
    - typingsSlinky.typeorm.typeormStrings.interval
    - typingsSlinky.typeorm.typeormStrings.year
    - typingsSlinky.typeorm.typeormStrings.seconddate
    - typingsSlinky.typeorm.typeormStrings.point
    - typingsSlinky.typeorm.typeormStrings.line
    - typingsSlinky.typeorm.typeormStrings.lseg
    - typingsSlinky.typeorm.typeormStrings.box
    - typingsSlinky.typeorm.typeormStrings.circle
    - typingsSlinky.typeorm.typeormStrings.path
    - typingsSlinky.typeorm.typeormStrings.polygon
    - typingsSlinky.typeorm.typeormStrings.geography
    - typingsSlinky.typeorm.typeormStrings.geometry
    - typingsSlinky.typeorm.typeormStrings.linestring
    - typingsSlinky.typeorm.typeormStrings.multipoint
    - typingsSlinky.typeorm.typeormStrings.multilinestring
    - typingsSlinky.typeorm.typeormStrings.multipolygon
    - typingsSlinky.typeorm.typeormStrings.geometrycollection
    - typingsSlinky.typeorm.typeormStrings.st_geometry
    - typingsSlinky.typeorm.typeormStrings.st_point
    - typingsSlinky.typeorm.typeormStrings.int4range
    - typingsSlinky.typeorm.typeormStrings.int8range
    - typingsSlinky.typeorm.typeormStrings.numrange
    - typingsSlinky.typeorm.typeormStrings.tsrange
    - typingsSlinky.typeorm.typeormStrings.tstzrange
    - typingsSlinky.typeorm.typeormStrings.daterange
    - typingsSlinky.typeorm.typeormStrings.enum
    - typingsSlinky.typeorm.typeormStrings.set
    - typingsSlinky.typeorm.typeormStrings.cidr
    - typingsSlinky.typeorm.typeormStrings.inet
    - typingsSlinky.typeorm.typeormStrings.macaddr
    - typingsSlinky.typeorm.typeormStrings.bit
    - typingsSlinky.typeorm.typeormStrings.`bit varying`
    - typingsSlinky.typeorm.typeormStrings.varbit
    - typingsSlinky.typeorm.typeormStrings.tsvector
    - typingsSlinky.typeorm.typeormStrings.tsquery
    - typingsSlinky.typeorm.typeormStrings.uuid
    - typingsSlinky.typeorm.typeormStrings.xml
    - typingsSlinky.typeorm.typeormStrings.json
    - typingsSlinky.typeorm.typeormStrings.jsonb
    - typingsSlinky.typeorm.typeormStrings.varbinary
    - typingsSlinky.typeorm.typeormStrings.hierarchyid
    - typingsSlinky.typeorm.typeormStrings.sql_variant
    - typingsSlinky.typeorm.typeormStrings.rowid
    - typingsSlinky.typeorm.typeormStrings.urowid
    - typingsSlinky.typeorm.typeormStrings.uniqueidentifier
    - typingsSlinky.typeorm.typeormStrings.rowversion
    - typingsSlinky.typeorm.typeormStrings.array
    - typingsSlinky.typeorm.typeormStrings.cube
    - typingsSlinky.typeorm.typeormStrings.ltree
  */
  trait SimpleColumnType extends _ColumnType
  object SimpleColumnType {
    
    @scala.inline
    def alphanum: typingsSlinky.typeorm.typeormStrings.alphanum = "alphanum".asInstanceOf[typingsSlinky.typeorm.typeormStrings.alphanum]
    
    @scala.inline
    def array: typingsSlinky.typeorm.typeormStrings.array = "array".asInstanceOf[typingsSlinky.typeorm.typeormStrings.array]
    
    @scala.inline
    def bfile: typingsSlinky.typeorm.typeormStrings.bfile = "bfile".asInstanceOf[typingsSlinky.typeorm.typeormStrings.bfile]
    
    @scala.inline
    def bit: typingsSlinky.typeorm.typeormStrings.bit = "bit".asInstanceOf[typingsSlinky.typeorm.typeormStrings.bit]
    
    @scala.inline
    def `bit varying`: typingsSlinky.typeorm.typeormStrings.`bit varying` = ("bit varying").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`bit varying`]
    
    @scala.inline
    def blob: typingsSlinky.typeorm.typeormStrings.blob = "blob".asInstanceOf[typingsSlinky.typeorm.typeormStrings.blob]
    
    @scala.inline
    def bool: typingsSlinky.typeorm.typeormStrings.bool = "bool".asInstanceOf[typingsSlinky.typeorm.typeormStrings.bool]
    
    @scala.inline
    def boolean: typingsSlinky.typeorm.typeormStrings.boolean = "boolean".asInstanceOf[typingsSlinky.typeorm.typeormStrings.boolean]
    
    @scala.inline
    def box: typingsSlinky.typeorm.typeormStrings.box = "box".asInstanceOf[typingsSlinky.typeorm.typeormStrings.box]
    
    @scala.inline
    def bytea: typingsSlinky.typeorm.typeormStrings.bytea = "bytea".asInstanceOf[typingsSlinky.typeorm.typeormStrings.bytea]
    
    @scala.inline
    def bytes: typingsSlinky.typeorm.typeormStrings.bytes = "bytes".asInstanceOf[typingsSlinky.typeorm.typeormStrings.bytes]
    
    @scala.inline
    def cidr: typingsSlinky.typeorm.typeormStrings.cidr = "cidr".asInstanceOf[typingsSlinky.typeorm.typeormStrings.cidr]
    
    @scala.inline
    def circle: typingsSlinky.typeorm.typeormStrings.circle = "circle".asInstanceOf[typingsSlinky.typeorm.typeormStrings.circle]
    
    @scala.inline
    def citext: typingsSlinky.typeorm.typeormStrings.citext = "citext".asInstanceOf[typingsSlinky.typeorm.typeormStrings.citext]
    
    @scala.inline
    def clob: typingsSlinky.typeorm.typeormStrings.clob = "clob".asInstanceOf[typingsSlinky.typeorm.typeormStrings.clob]
    
    @scala.inline
    def cube: typingsSlinky.typeorm.typeormStrings.cube = "cube".asInstanceOf[typingsSlinky.typeorm.typeormStrings.cube]
    
    @scala.inline
    def date: typingsSlinky.typeorm.typeormStrings.date = "date".asInstanceOf[typingsSlinky.typeorm.typeormStrings.date]
    
    @scala.inline
    def daterange: typingsSlinky.typeorm.typeormStrings.daterange = "daterange".asInstanceOf[typingsSlinky.typeorm.typeormStrings.daterange]
    
    @scala.inline
    def enum: typingsSlinky.typeorm.typeormStrings.enum = "enum".asInstanceOf[typingsSlinky.typeorm.typeormStrings.enum]
    
    @scala.inline
    def float: typingsSlinky.typeorm.typeormStrings.float = "float".asInstanceOf[typingsSlinky.typeorm.typeormStrings.float]
    
    @scala.inline
    def float4: typingsSlinky.typeorm.typeormStrings.float4 = "float4".asInstanceOf[typingsSlinky.typeorm.typeormStrings.float4]
    
    @scala.inline
    def float8: typingsSlinky.typeorm.typeormStrings.float8 = "float8".asInstanceOf[typingsSlinky.typeorm.typeormStrings.float8]
    
    @scala.inline
    def geography: typingsSlinky.typeorm.typeormStrings.geography = "geography".asInstanceOf[typingsSlinky.typeorm.typeormStrings.geography]
    
    @scala.inline
    def geometry: typingsSlinky.typeorm.typeormStrings.geometry = "geometry".asInstanceOf[typingsSlinky.typeorm.typeormStrings.geometry]
    
    @scala.inline
    def geometrycollection: typingsSlinky.typeorm.typeormStrings.geometrycollection = "geometrycollection".asInstanceOf[typingsSlinky.typeorm.typeormStrings.geometrycollection]
    
    @scala.inline
    def hierarchyid: typingsSlinky.typeorm.typeormStrings.hierarchyid = "hierarchyid".asInstanceOf[typingsSlinky.typeorm.typeormStrings.hierarchyid]
    
    @scala.inline
    def hstore: typingsSlinky.typeorm.typeormStrings.hstore = "hstore".asInstanceOf[typingsSlinky.typeorm.typeormStrings.hstore]
    
    @scala.inline
    def image: typingsSlinky.typeorm.typeormStrings.image = "image".asInstanceOf[typingsSlinky.typeorm.typeormStrings.image]
    
    @scala.inline
    def inet: typingsSlinky.typeorm.typeormStrings.inet = "inet".asInstanceOf[typingsSlinky.typeorm.typeormStrings.inet]
    
    @scala.inline
    def int2: typingsSlinky.typeorm.typeormStrings.int2 = "int2".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int2]
    
    @scala.inline
    def int4: typingsSlinky.typeorm.typeormStrings.int4 = "int4".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int4]
    
    @scala.inline
    def int4range: typingsSlinky.typeorm.typeormStrings.int4range = "int4range".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int4range]
    
    @scala.inline
    def int64: typingsSlinky.typeorm.typeormStrings.int64 = "int64".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int64]
    
    @scala.inline
    def int8: typingsSlinky.typeorm.typeormStrings.int8 = "int8".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int8]
    
    @scala.inline
    def int8range: typingsSlinky.typeorm.typeormStrings.int8range = "int8range".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int8range]
    
    @scala.inline
    def integer: typingsSlinky.typeorm.typeormStrings.integer = "integer".asInstanceOf[typingsSlinky.typeorm.typeormStrings.integer]
    
    @scala.inline
    def interval: typingsSlinky.typeorm.typeormStrings.interval = "interval".asInstanceOf[typingsSlinky.typeorm.typeormStrings.interval]
    
    @scala.inline
    def `interval day to second`: typingsSlinky.typeorm.typeormStrings.`interval day to second` = ("interval day to second").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`interval day to second`]
    
    @scala.inline
    def `interval year to month`: typingsSlinky.typeorm.typeormStrings.`interval year to month` = ("interval year to month").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`interval year to month`]
    
    @scala.inline
    def json: typingsSlinky.typeorm.typeormStrings.json = "json".asInstanceOf[typingsSlinky.typeorm.typeormStrings.json]
    
    @scala.inline
    def jsonb: typingsSlinky.typeorm.typeormStrings.jsonb = "jsonb".asInstanceOf[typingsSlinky.typeorm.typeormStrings.jsonb]
    
    @scala.inline
    def line: typingsSlinky.typeorm.typeormStrings.line = "line".asInstanceOf[typingsSlinky.typeorm.typeormStrings.line]
    
    @scala.inline
    def linestring: typingsSlinky.typeorm.typeormStrings.linestring = "linestring".asInstanceOf[typingsSlinky.typeorm.typeormStrings.linestring]
    
    @scala.inline
    def long: typingsSlinky.typeorm.typeormStrings.long = "long".asInstanceOf[typingsSlinky.typeorm.typeormStrings.long]
    
    @scala.inline
    def `long raw`: typingsSlinky.typeorm.typeormStrings.`long raw` = ("long raw").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`long raw`]
    
    @scala.inline
    def longblob: typingsSlinky.typeorm.typeormStrings.longblob = "longblob".asInstanceOf[typingsSlinky.typeorm.typeormStrings.longblob]
    
    @scala.inline
    def longtext: typingsSlinky.typeorm.typeormStrings.longtext = "longtext".asInstanceOf[typingsSlinky.typeorm.typeormStrings.longtext]
    
    @scala.inline
    def lseg: typingsSlinky.typeorm.typeormStrings.lseg = "lseg".asInstanceOf[typingsSlinky.typeorm.typeormStrings.lseg]
    
    @scala.inline
    def ltree: typingsSlinky.typeorm.typeormStrings.ltree = "ltree".asInstanceOf[typingsSlinky.typeorm.typeormStrings.ltree]
    
    @scala.inline
    def macaddr: typingsSlinky.typeorm.typeormStrings.macaddr = "macaddr".asInstanceOf[typingsSlinky.typeorm.typeormStrings.macaddr]
    
    @scala.inline
    def mediumblob: typingsSlinky.typeorm.typeormStrings.mediumblob = "mediumblob".asInstanceOf[typingsSlinky.typeorm.typeormStrings.mediumblob]
    
    @scala.inline
    def mediumtext: typingsSlinky.typeorm.typeormStrings.mediumtext = "mediumtext".asInstanceOf[typingsSlinky.typeorm.typeormStrings.mediumtext]
    
    @scala.inline
    def money: typingsSlinky.typeorm.typeormStrings.money = "money".asInstanceOf[typingsSlinky.typeorm.typeormStrings.money]
    
    @scala.inline
    def multilinestring: typingsSlinky.typeorm.typeormStrings.multilinestring = "multilinestring".asInstanceOf[typingsSlinky.typeorm.typeormStrings.multilinestring]
    
    @scala.inline
    def multipoint: typingsSlinky.typeorm.typeormStrings.multipoint = "multipoint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.multipoint]
    
    @scala.inline
    def multipolygon: typingsSlinky.typeorm.typeormStrings.multipolygon = "multipolygon".asInstanceOf[typingsSlinky.typeorm.typeormStrings.multipolygon]
    
    @scala.inline
    def nclob: typingsSlinky.typeorm.typeormStrings.nclob = "nclob".asInstanceOf[typingsSlinky.typeorm.typeormStrings.nclob]
    
    @scala.inline
    def ntext: typingsSlinky.typeorm.typeormStrings.ntext = "ntext".asInstanceOf[typingsSlinky.typeorm.typeormStrings.ntext]
    
    @scala.inline
    def numrange: typingsSlinky.typeorm.typeormStrings.numrange = "numrange".asInstanceOf[typingsSlinky.typeorm.typeormStrings.numrange]
    
    @scala.inline
    def path: typingsSlinky.typeorm.typeormStrings.path = "path".asInstanceOf[typingsSlinky.typeorm.typeormStrings.path]
    
    @scala.inline
    def point: typingsSlinky.typeorm.typeormStrings.point = "point".asInstanceOf[typingsSlinky.typeorm.typeormStrings.point]
    
    @scala.inline
    def polygon: typingsSlinky.typeorm.typeormStrings.polygon = "polygon".asInstanceOf[typingsSlinky.typeorm.typeormStrings.polygon]
    
    @scala.inline
    def raw: typingsSlinky.typeorm.typeormStrings.raw = "raw".asInstanceOf[typingsSlinky.typeorm.typeormStrings.raw]
    
    @scala.inline
    def rowid: typingsSlinky.typeorm.typeormStrings.rowid = "rowid".asInstanceOf[typingsSlinky.typeorm.typeormStrings.rowid]
    
    @scala.inline
    def rowversion: typingsSlinky.typeorm.typeormStrings.rowversion = "rowversion".asInstanceOf[typingsSlinky.typeorm.typeormStrings.rowversion]
    
    @scala.inline
    def seconddate: typingsSlinky.typeorm.typeormStrings.seconddate = "seconddate".asInstanceOf[typingsSlinky.typeorm.typeormStrings.seconddate]
    
    @scala.inline
    def set: typingsSlinky.typeorm.typeormStrings.set = "set".asInstanceOf[typingsSlinky.typeorm.typeormStrings.set]
    
    @scala.inline
    def shorttext: typingsSlinky.typeorm.typeormStrings.shorttext = "shorttext".asInstanceOf[typingsSlinky.typeorm.typeormStrings.shorttext]
    
    @scala.inline
    def `simple-array`: typingsSlinky.typeorm.typeormStrings.`simple-array` = "simple-array".asInstanceOf[typingsSlinky.typeorm.typeormStrings.`simple-array`]
    
    @scala.inline
    def `simple-enum`: typingsSlinky.typeorm.typeormStrings.`simple-enum` = "simple-enum".asInstanceOf[typingsSlinky.typeorm.typeormStrings.`simple-enum`]
    
    @scala.inline
    def `simple-json`: typingsSlinky.typeorm.typeormStrings.`simple-json` = "simple-json".asInstanceOf[typingsSlinky.typeorm.typeormStrings.`simple-json`]
    
    @scala.inline
    def smalldatetime: typingsSlinky.typeorm.typeormStrings.smalldatetime = "smalldatetime".asInstanceOf[typingsSlinky.typeorm.typeormStrings.smalldatetime]
    
    @scala.inline
    def smallmoney: typingsSlinky.typeorm.typeormStrings.smallmoney = "smallmoney".asInstanceOf[typingsSlinky.typeorm.typeormStrings.smallmoney]
    
    @scala.inline
    def sql_variant: typingsSlinky.typeorm.typeormStrings.sql_variant = "sql_variant".asInstanceOf[typingsSlinky.typeorm.typeormStrings.sql_variant]
    
    @scala.inline
    def st_geometry: typingsSlinky.typeorm.typeormStrings.st_geometry = "st_geometry".asInstanceOf[typingsSlinky.typeorm.typeormStrings.st_geometry]
    
    @scala.inline
    def st_point: typingsSlinky.typeorm.typeormStrings.st_point = "st_point".asInstanceOf[typingsSlinky.typeorm.typeormStrings.st_point]
    
    @scala.inline
    def text: typingsSlinky.typeorm.typeormStrings.text = "text".asInstanceOf[typingsSlinky.typeorm.typeormStrings.text]
    
    @scala.inline
    def `timestamp with local time zone`: typingsSlinky.typeorm.typeormStrings.`timestamp with local time zone` = ("timestamp with local time zone").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`timestamp with local time zone`]
    
    @scala.inline
    def timestamptz: typingsSlinky.typeorm.typeormStrings.timestamptz = "timestamptz".asInstanceOf[typingsSlinky.typeorm.typeormStrings.timestamptz]
    
    @scala.inline
    def timetz: typingsSlinky.typeorm.typeormStrings.timetz = "timetz".asInstanceOf[typingsSlinky.typeorm.typeormStrings.timetz]
    
    @scala.inline
    def tinyblob: typingsSlinky.typeorm.typeormStrings.tinyblob = "tinyblob".asInstanceOf[typingsSlinky.typeorm.typeormStrings.tinyblob]
    
    @scala.inline
    def tinytext: typingsSlinky.typeorm.typeormStrings.tinytext = "tinytext".asInstanceOf[typingsSlinky.typeorm.typeormStrings.tinytext]
    
    @scala.inline
    def tsquery: typingsSlinky.typeorm.typeormStrings.tsquery = "tsquery".asInstanceOf[typingsSlinky.typeorm.typeormStrings.tsquery]
    
    @scala.inline
    def tsrange: typingsSlinky.typeorm.typeormStrings.tsrange = "tsrange".asInstanceOf[typingsSlinky.typeorm.typeormStrings.tsrange]
    
    @scala.inline
    def tstzrange: typingsSlinky.typeorm.typeormStrings.tstzrange = "tstzrange".asInstanceOf[typingsSlinky.typeorm.typeormStrings.tstzrange]
    
    @scala.inline
    def tsvector: typingsSlinky.typeorm.typeormStrings.tsvector = "tsvector".asInstanceOf[typingsSlinky.typeorm.typeormStrings.tsvector]
    
    @scala.inline
    def uniqueidentifier: typingsSlinky.typeorm.typeormStrings.uniqueidentifier = "uniqueidentifier".asInstanceOf[typingsSlinky.typeorm.typeormStrings.uniqueidentifier]
    
    @scala.inline
    def `unsigned big int`: typingsSlinky.typeorm.typeormStrings.`unsigned big int` = ("unsigned big int").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`unsigned big int`]
    
    @scala.inline
    def urowid: typingsSlinky.typeorm.typeormStrings.urowid = "urowid".asInstanceOf[typingsSlinky.typeorm.typeormStrings.urowid]
    
    @scala.inline
    def uuid: typingsSlinky.typeorm.typeormStrings.uuid = "uuid".asInstanceOf[typingsSlinky.typeorm.typeormStrings.uuid]
    
    @scala.inline
    def varbinary: typingsSlinky.typeorm.typeormStrings.varbinary = "varbinary".asInstanceOf[typingsSlinky.typeorm.typeormStrings.varbinary]
    
    @scala.inline
    def varbit: typingsSlinky.typeorm.typeormStrings.varbit = "varbit".asInstanceOf[typingsSlinky.typeorm.typeormStrings.varbit]
    
    @scala.inline
    def xml: typingsSlinky.typeorm.typeormStrings.xml = "xml".asInstanceOf[typingsSlinky.typeorm.typeormStrings.xml]
    
    @scala.inline
    def year: typingsSlinky.typeorm.typeormStrings.year = "year".asInstanceOf[typingsSlinky.typeorm.typeormStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.typeormStrings.geometry
    - typingsSlinky.typeorm.typeormStrings.geography
    - typingsSlinky.typeorm.typeormStrings.st_geometry
    - typingsSlinky.typeorm.typeormStrings.st_point
  */
  trait SpatialColumnType extends _ColumnType
  object SpatialColumnType {
    
    @scala.inline
    def geography: typingsSlinky.typeorm.typeormStrings.geography = "geography".asInstanceOf[typingsSlinky.typeorm.typeormStrings.geography]
    
    @scala.inline
    def geometry: typingsSlinky.typeorm.typeormStrings.geometry = "geometry".asInstanceOf[typingsSlinky.typeorm.typeormStrings.geometry]
    
    @scala.inline
    def st_geometry: typingsSlinky.typeorm.typeormStrings.st_geometry = "st_geometry".asInstanceOf[typingsSlinky.typeorm.typeormStrings.st_geometry]
    
    @scala.inline
    def st_point: typingsSlinky.typeorm.typeormStrings.st_point = "st_point".asInstanceOf[typingsSlinky.typeorm.typeormStrings.st_point]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.typeormStrings.`character varying`
    - typingsSlinky.typeorm.typeormStrings.`varying character`
    - typingsSlinky.typeorm.typeormStrings.`char varying`
    - typingsSlinky.typeorm.typeormStrings.nvarchar
    - typingsSlinky.typeorm.typeormStrings.`national varchar`
    - typingsSlinky.typeorm.typeormStrings.character
    - typingsSlinky.typeorm.typeormStrings.`native character`
    - typingsSlinky.typeorm.typeormStrings.varchar
    - typingsSlinky.typeorm.typeormStrings.char
    - typingsSlinky.typeorm.typeormStrings.nchar
    - typingsSlinky.typeorm.typeormStrings.`national char`
    - typingsSlinky.typeorm.typeormStrings.varchar2
    - typingsSlinky.typeorm.typeormStrings.nvarchar2
    - typingsSlinky.typeorm.typeormStrings.alphanum
    - typingsSlinky.typeorm.typeormStrings.shorttext
    - typingsSlinky.typeorm.typeormStrings.raw
    - typingsSlinky.typeorm.typeormStrings.binary
    - typingsSlinky.typeorm.typeormStrings.varbinary
    - typingsSlinky.typeorm.typeormStrings.string
  */
  trait WithLengthColumnType extends _ColumnType
  object WithLengthColumnType {
    
    @scala.inline
    def alphanum: typingsSlinky.typeorm.typeormStrings.alphanum = "alphanum".asInstanceOf[typingsSlinky.typeorm.typeormStrings.alphanum]
    
    @scala.inline
    def binary: typingsSlinky.typeorm.typeormStrings.binary = "binary".asInstanceOf[typingsSlinky.typeorm.typeormStrings.binary]
    
    @scala.inline
    def char: typingsSlinky.typeorm.typeormStrings.char = "char".asInstanceOf[typingsSlinky.typeorm.typeormStrings.char]
    
    @scala.inline
    def `char varying`: typingsSlinky.typeorm.typeormStrings.`char varying` = ("char varying").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`char varying`]
    
    @scala.inline
    def character: typingsSlinky.typeorm.typeormStrings.character = "character".asInstanceOf[typingsSlinky.typeorm.typeormStrings.character]
    
    @scala.inline
    def `character varying`: typingsSlinky.typeorm.typeormStrings.`character varying` = ("character varying").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`character varying`]
    
    @scala.inline
    def `national char`: typingsSlinky.typeorm.typeormStrings.`national char` = ("national char").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`national char`]
    
    @scala.inline
    def `national varchar`: typingsSlinky.typeorm.typeormStrings.`national varchar` = ("national varchar").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`national varchar`]
    
    @scala.inline
    def `native character`: typingsSlinky.typeorm.typeormStrings.`native character` = ("native character").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`native character`]
    
    @scala.inline
    def nchar: typingsSlinky.typeorm.typeormStrings.nchar = "nchar".asInstanceOf[typingsSlinky.typeorm.typeormStrings.nchar]
    
    @scala.inline
    def nvarchar: typingsSlinky.typeorm.typeormStrings.nvarchar = "nvarchar".asInstanceOf[typingsSlinky.typeorm.typeormStrings.nvarchar]
    
    @scala.inline
    def nvarchar2: typingsSlinky.typeorm.typeormStrings.nvarchar2 = "nvarchar2".asInstanceOf[typingsSlinky.typeorm.typeormStrings.nvarchar2]
    
    @scala.inline
    def raw: typingsSlinky.typeorm.typeormStrings.raw = "raw".asInstanceOf[typingsSlinky.typeorm.typeormStrings.raw]
    
    @scala.inline
    def shorttext: typingsSlinky.typeorm.typeormStrings.shorttext = "shorttext".asInstanceOf[typingsSlinky.typeorm.typeormStrings.shorttext]
    
    @scala.inline
    def string: typingsSlinky.typeorm.typeormStrings.string = "string".asInstanceOf[typingsSlinky.typeorm.typeormStrings.string]
    
    @scala.inline
    def varbinary: typingsSlinky.typeorm.typeormStrings.varbinary = "varbinary".asInstanceOf[typingsSlinky.typeorm.typeormStrings.varbinary]
    
    @scala.inline
    def varchar: typingsSlinky.typeorm.typeormStrings.varchar = "varchar".asInstanceOf[typingsSlinky.typeorm.typeormStrings.varchar]
    
    @scala.inline
    def varchar2: typingsSlinky.typeorm.typeormStrings.varchar2 = "varchar2".asInstanceOf[typingsSlinky.typeorm.typeormStrings.varchar2]
    
    @scala.inline
    def `varying character`: typingsSlinky.typeorm.typeormStrings.`varying character` = ("varying character").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`varying character`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.typeormStrings.float
    - typingsSlinky.typeorm.typeormStrings.double
    - typingsSlinky.typeorm.typeormStrings.dec
    - typingsSlinky.typeorm.typeormStrings.decimal
    - typingsSlinky.typeorm.typeormStrings.smalldecimal
    - typingsSlinky.typeorm.typeormStrings.fixed
    - typingsSlinky.typeorm.typeormStrings.numeric
    - typingsSlinky.typeorm.typeormStrings.real
    - typingsSlinky.typeorm.typeormStrings.`double precision`
    - typingsSlinky.typeorm.typeormStrings.number
    - typingsSlinky.typeorm.typeormStrings.datetime
    - typingsSlinky.typeorm.typeormStrings.datetime2
    - typingsSlinky.typeorm.typeormStrings.datetimeoffset
    - typingsSlinky.typeorm.typeormStrings.time
    - typingsSlinky.typeorm.typeormStrings.`time with time zone`
    - typingsSlinky.typeorm.typeormStrings.`time without time zone`
    - typingsSlinky.typeorm.typeormStrings.timestamp
    - typingsSlinky.typeorm.typeormStrings.`timestamp without time zone`
    - typingsSlinky.typeorm.typeormStrings.`timestamp with time zone`
    - typingsSlinky.typeorm.typeormStrings.`timestamp with local time zone`
  */
  trait WithPrecisionColumnType extends _ColumnType
  object WithPrecisionColumnType {
    
    @scala.inline
    def datetime: typingsSlinky.typeorm.typeormStrings.datetime = "datetime".asInstanceOf[typingsSlinky.typeorm.typeormStrings.datetime]
    
    @scala.inline
    def datetime2: typingsSlinky.typeorm.typeormStrings.datetime2 = "datetime2".asInstanceOf[typingsSlinky.typeorm.typeormStrings.datetime2]
    
    @scala.inline
    def datetimeoffset: typingsSlinky.typeorm.typeormStrings.datetimeoffset = "datetimeoffset".asInstanceOf[typingsSlinky.typeorm.typeormStrings.datetimeoffset]
    
    @scala.inline
    def dec: typingsSlinky.typeorm.typeormStrings.dec = "dec".asInstanceOf[typingsSlinky.typeorm.typeormStrings.dec]
    
    @scala.inline
    def decimal: typingsSlinky.typeorm.typeormStrings.decimal = "decimal".asInstanceOf[typingsSlinky.typeorm.typeormStrings.decimal]
    
    @scala.inline
    def double: typingsSlinky.typeorm.typeormStrings.double = "double".asInstanceOf[typingsSlinky.typeorm.typeormStrings.double]
    
    @scala.inline
    def `double precision`: typingsSlinky.typeorm.typeormStrings.`double precision` = ("double precision").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`double precision`]
    
    @scala.inline
    def fixed: typingsSlinky.typeorm.typeormStrings.fixed = "fixed".asInstanceOf[typingsSlinky.typeorm.typeormStrings.fixed]
    
    @scala.inline
    def float: typingsSlinky.typeorm.typeormStrings.float = "float".asInstanceOf[typingsSlinky.typeorm.typeormStrings.float]
    
    @scala.inline
    def number: typingsSlinky.typeorm.typeormStrings.number = "number".asInstanceOf[typingsSlinky.typeorm.typeormStrings.number]
    
    @scala.inline
    def numeric: typingsSlinky.typeorm.typeormStrings.numeric = "numeric".asInstanceOf[typingsSlinky.typeorm.typeormStrings.numeric]
    
    @scala.inline
    def real: typingsSlinky.typeorm.typeormStrings.real = "real".asInstanceOf[typingsSlinky.typeorm.typeormStrings.real]
    
    @scala.inline
    def smalldecimal: typingsSlinky.typeorm.typeormStrings.smalldecimal = "smalldecimal".asInstanceOf[typingsSlinky.typeorm.typeormStrings.smalldecimal]
    
    @scala.inline
    def time: typingsSlinky.typeorm.typeormStrings.time = "time".asInstanceOf[typingsSlinky.typeorm.typeormStrings.time]
    
    @scala.inline
    def `time with time zone`: typingsSlinky.typeorm.typeormStrings.`time with time zone` = ("time with time zone").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`time with time zone`]
    
    @scala.inline
    def `time without time zone`: typingsSlinky.typeorm.typeormStrings.`time without time zone` = ("time without time zone").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`time without time zone`]
    
    @scala.inline
    def timestamp: typingsSlinky.typeorm.typeormStrings.timestamp = "timestamp".asInstanceOf[typingsSlinky.typeorm.typeormStrings.timestamp]
    
    @scala.inline
    def `timestamp with local time zone`: typingsSlinky.typeorm.typeormStrings.`timestamp with local time zone` = ("timestamp with local time zone").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`timestamp with local time zone`]
    
    @scala.inline
    def `timestamp with time zone`: typingsSlinky.typeorm.typeormStrings.`timestamp with time zone` = ("timestamp with time zone").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`timestamp with time zone`]
    
    @scala.inline
    def `timestamp without time zone`: typingsSlinky.typeorm.typeormStrings.`timestamp without time zone` = ("timestamp without time zone").asInstanceOf[typingsSlinky.typeorm.typeormStrings.`timestamp without time zone`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.typeormStrings.tinyint
    - typingsSlinky.typeorm.typeormStrings.smallint
    - typingsSlinky.typeorm.typeormStrings.mediumint
    - typingsSlinky.typeorm.typeormStrings.int
    - typingsSlinky.typeorm.typeormStrings.bigint
  */
  trait WithWidthColumnType extends _ColumnType
  object WithWidthColumnType {
    
    @scala.inline
    def bigint: typingsSlinky.typeorm.typeormStrings.bigint = "bigint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.bigint]
    
    @scala.inline
    def int: typingsSlinky.typeorm.typeormStrings.int = "int".asInstanceOf[typingsSlinky.typeorm.typeormStrings.int]
    
    @scala.inline
    def mediumint: typingsSlinky.typeorm.typeormStrings.mediumint = "mediumint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.mediumint]
    
    @scala.inline
    def smallint: typingsSlinky.typeorm.typeormStrings.smallint = "smallint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.smallint]
    
    @scala.inline
    def tinyint: typingsSlinky.typeorm.typeormStrings.tinyint = "tinyint".asInstanceOf[typingsSlinky.typeorm.typeormStrings.tinyint]
  }
  
  trait _ColumnType extends StObject
}
