PGDMP     %    
                z            EczaneSistemi    14.2    14.2 1    (           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            )           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            *           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            +           1262    16394    EczaneSistemi    DATABASE     l   CREATE DATABASE "EczaneSistemi" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "EczaneSistemi";
                postgres    false            �            1259    16399    dagiticifirma    TABLE     |  CREATE TABLE public.dagiticifirma (
    firma_id integer NOT NULL,
    firma_name character varying(250) NOT NULL,
    firma_no character varying(250) NOT NULL,
    firma_telefon character varying(250) NOT NULL,
    firma_adres character varying(250) NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
 !   DROP TABLE public.dagiticifirma;
       public         heap    postgres    false            �            1259    16405    dagiticifirma_firma_id_seq    SEQUENCE     �   CREATE SEQUENCE public.dagiticifirma_firma_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.dagiticifirma_firma_id_seq;
       public          postgres    false    209            ,           0    0    dagiticifirma_firma_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.dagiticifirma_firma_id_seq OWNED BY public.dagiticifirma.firma_id;
          public          postgres    false    210            �            1259    16406    hasta    TABLE     %  CREATE TABLE public.hasta (
    hasta_id integer NOT NULL,
    hasta_name character varying(250) NOT NULL,
    hasta_tc character varying(250) NOT NULL,
    ilac_id integer,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.hasta;
       public         heap    postgres    false            �            1259    16412    hasta_hasta_id_seq    SEQUENCE     �   CREATE SEQUENCE public.hasta_hasta_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hasta_hasta_id_seq;
       public          postgres    false    211            -           0    0    hasta_hasta_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.hasta_hasta_id_seq OWNED BY public.hasta.hasta_id;
          public          postgres    false    212            �            1259    16413    ilac    TABLE     1  CREATE TABLE public.ilac (
    ilac_id integer NOT NULL,
    seri_no character varying(250) NOT NULL,
    name character varying(250) NOT NULL,
    type character varying(250) NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.ilac;
       public         heap    postgres    false            �            1259    16419    ilac_ilac_id_seq    SEQUENCE     �   CREATE SEQUENCE public.ilac_ilac_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.ilac_ilac_id_seq;
       public          postgres    false    213            .           0    0    ilac_ilac_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.ilac_ilac_id_seq OWNED BY public.ilac.ilac_id;
          public          postgres    false    214            �            1259    16478    odeme    TABLE       CREATE TABLE public.odeme (
    odeme_id integer NOT NULL,
    odeme_toplam character varying(250) NOT NULL,
    odeme_turu character varying(250) NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.odeme;
       public         heap    postgres    false            �            1259    16494    odeme_firma    TABLE     i   CREATE TABLE public.odeme_firma (
    id integer NOT NULL,
    odeme_id integer,
    firma_id integer
);
    DROP TABLE public.odeme_firma;
       public         heap    postgres    false            �            1259    16493    odeme_firma_id_seq    SEQUENCE     �   CREATE SEQUENCE public.odeme_firma_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.odeme_firma_id_seq;
       public          postgres    false    220            /           0    0    odeme_firma_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.odeme_firma_id_seq OWNED BY public.odeme_firma.id;
          public          postgres    false    219            �            1259    16477    odeme_odeme_id_seq    SEQUENCE     �   CREATE SEQUENCE public.odeme_odeme_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.odeme_odeme_id_seq;
       public          postgres    false    218            0           0    0    odeme_odeme_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.odeme_odeme_id_seq OWNED BY public.odeme.odeme_id;
          public          postgres    false    217            �            1259    16427    personel    TABLE     �  CREATE TABLE public.personel (
    personel_id integer NOT NULL,
    personel_name character varying(250) NOT NULL,
    personel_tc character varying(250) NOT NULL,
    personel_telefon character varying(250) NOT NULL,
    personel_maas character varying(250) NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.personel;
       public         heap    postgres    false            �            1259    16433    personel_personel_id_seq    SEQUENCE     �   CREATE SEQUENCE public.personel_personel_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.personel_personel_id_seq;
       public          postgres    false    215            1           0    0    personel_personel_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.personel_personel_id_seq OWNED BY public.personel.personel_id;
          public          postgres    false    216            v           2604    16435    dagiticifirma firma_id    DEFAULT     �   ALTER TABLE ONLY public.dagiticifirma ALTER COLUMN firma_id SET DEFAULT nextval('public.dagiticifirma_firma_id_seq'::regclass);
 E   ALTER TABLE public.dagiticifirma ALTER COLUMN firma_id DROP DEFAULT;
       public          postgres    false    210    209            x           2604    16436    hasta hasta_id    DEFAULT     p   ALTER TABLE ONLY public.hasta ALTER COLUMN hasta_id SET DEFAULT nextval('public.hasta_hasta_id_seq'::regclass);
 =   ALTER TABLE public.hasta ALTER COLUMN hasta_id DROP DEFAULT;
       public          postgres    false    212    211            z           2604    16437    ilac ilac_id    DEFAULT     l   ALTER TABLE ONLY public.ilac ALTER COLUMN ilac_id SET DEFAULT nextval('public.ilac_ilac_id_seq'::regclass);
 ;   ALTER TABLE public.ilac ALTER COLUMN ilac_id DROP DEFAULT;
       public          postgres    false    214    213            }           2604    16481    odeme odeme_id    DEFAULT     p   ALTER TABLE ONLY public.odeme ALTER COLUMN odeme_id SET DEFAULT nextval('public.odeme_odeme_id_seq'::regclass);
 =   ALTER TABLE public.odeme ALTER COLUMN odeme_id DROP DEFAULT;
       public          postgres    false    218    217    218                       2604    16497    odeme_firma id    DEFAULT     p   ALTER TABLE ONLY public.odeme_firma ALTER COLUMN id SET DEFAULT nextval('public.odeme_firma_id_seq'::regclass);
 =   ALTER TABLE public.odeme_firma ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    220    219    220            |           2604    16439    personel personel_id    DEFAULT     |   ALTER TABLE ONLY public.personel ALTER COLUMN personel_id SET DEFAULT nextval('public.personel_personel_id_seq'::regclass);
 C   ALTER TABLE public.personel ALTER COLUMN personel_id DROP DEFAULT;
       public          postgres    false    216    215                      0    16399    dagiticifirma 
   TABLE DATA           u   COPY public.dagiticifirma (firma_id, firma_name, firma_no, firma_telefon, firma_adres, created, updated) FROM stdin;
    public          postgres    false    209   �8                 0    16406    hasta 
   TABLE DATA           Z   COPY public.hasta (hasta_id, hasta_name, hasta_tc, ilac_id, created, updated) FROM stdin;
    public          postgres    false    211   �9                 0    16413    ilac 
   TABLE DATA           N   COPY public.ilac (ilac_id, seri_no, name, type, created, updated) FROM stdin;
    public          postgres    false    213   �9       #          0    16478    odeme 
   TABLE DATA           U   COPY public.odeme (odeme_id, odeme_toplam, odeme_turu, created, updated) FROM stdin;
    public          postgres    false    218   �:       %          0    16494    odeme_firma 
   TABLE DATA           =   COPY public.odeme_firma (id, odeme_id, firma_id) FROM stdin;
    public          postgres    false    220   4;                  0    16427    personel 
   TABLE DATA           ~   COPY public.personel (personel_id, personel_name, personel_tc, personel_telefon, personel_maas, created, updated) FROM stdin;
    public          postgres    false    215   f;       2           0    0    dagiticifirma_firma_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.dagiticifirma_firma_id_seq', 5, true);
          public          postgres    false    210            3           0    0    hasta_hasta_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.hasta_hasta_id_seq', 8, true);
          public          postgres    false    212            4           0    0    ilac_ilac_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.ilac_ilac_id_seq', 14, true);
          public          postgres    false    214            5           0    0    odeme_firma_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.odeme_firma_id_seq', 9, true);
          public          postgres    false    219            6           0    0    odeme_odeme_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.odeme_odeme_id_seq', 11, true);
          public          postgres    false    217            7           0    0    personel_personel_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.personel_personel_id_seq', 9, true);
          public          postgres    false    216            �           2606    16443     dagiticifirma dagiticifirma_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.dagiticifirma
    ADD CONSTRAINT dagiticifirma_pkey PRIMARY KEY (firma_id);
 J   ALTER TABLE ONLY public.dagiticifirma DROP CONSTRAINT dagiticifirma_pkey;
       public            postgres    false    209            �           2606    16445    hasta hasta_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.hasta
    ADD CONSTRAINT hasta_pkey PRIMARY KEY (hasta_id);
 :   ALTER TABLE ONLY public.hasta DROP CONSTRAINT hasta_pkey;
       public            postgres    false    211            �           2606    16447    ilac ilac_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.ilac
    ADD CONSTRAINT ilac_pkey PRIMARY KEY (ilac_id);
 8   ALTER TABLE ONLY public.ilac DROP CONSTRAINT ilac_pkey;
       public            postgres    false    213            �           2606    16499    odeme_firma odeme_firma_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.odeme_firma
    ADD CONSTRAINT odeme_firma_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.odeme_firma DROP CONSTRAINT odeme_firma_pkey;
       public            postgres    false    220            �           2606    16486    odeme odeme_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.odeme
    ADD CONSTRAINT odeme_pkey PRIMARY KEY (odeme_id);
 :   ALTER TABLE ONLY public.odeme DROP CONSTRAINT odeme_pkey;
       public            postgres    false    218            �           2606    16451    personel personel_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.personel
    ADD CONSTRAINT personel_pkey PRIMARY KEY (personel_id);
 @   ALTER TABLE ONLY public.personel DROP CONSTRAINT personel_pkey;
       public            postgres    false    215            �           2606    16505    odeme_firma firma_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.odeme_firma
    ADD CONSTRAINT firma_fk FOREIGN KEY (firma_id) REFERENCES public.dagiticifirma(firma_id);
 >   ALTER TABLE ONLY public.odeme_firma DROP CONSTRAINT firma_fk;
       public          postgres    false    3201    220    209            �           2606    16457    hasta ilac_fk    FK CONSTRAINT     p   ALTER TABLE ONLY public.hasta
    ADD CONSTRAINT ilac_fk FOREIGN KEY (ilac_id) REFERENCES public.ilac(ilac_id);
 7   ALTER TABLE ONLY public.hasta DROP CONSTRAINT ilac_fk;
       public          postgres    false    3205    211    213            �           2606    16500    odeme_firma odeme_fk    FK CONSTRAINT     z   ALTER TABLE ONLY public.odeme_firma
    ADD CONSTRAINT odeme_fk FOREIGN KEY (odeme_id) REFERENCES public.odeme(odeme_id);
 >   ALTER TABLE ONLY public.odeme_firma DROP CONSTRAINT odeme_fk;
       public          postgres    false    218    3209    220               w   x�3�t�,�M�40�4011Q�` ��M�I,�L�4202�50�52Q04�2��20�3*�.ndfd�e�P�Z�Y��ihd�&�f�G6�$�%���4�26�2��301�!nbi`����� �|%~         h   x�u���0g�+����NH6v&K��_�N�*��t:]���ng�.�J5Oy(�"�G�a�X�^UC���3���:�wE�?}�@���?�K�-0�ks�         �   x�}�1
�0�����@�{/�%m�n����K��RKRO��C��R]?~~bX"�Py���U�ws�u����ܢ�,ID���N�}���� 2�R�On!2G���A���E洔��ᐖo���!�ފ�}���c>�
7�      #   �   x�u���0Dkr
/`��D�R��@&H# )./�2Xdw��}�@�	(��.�B"#�(a`-�ū���s�l	c������T�����c_(9���F^0�(��S�NM�;��Z�s���K�2fc�=�"��F6�      %   "   x�3��4�2��\f��@�9�2����� @K�          t   x�u̱�0F�Z���'��l�{ФH�PѰ۰��M�W��kt�o��J
�h}$IDw/f ��X$xQ�2�Y�����N�����?�w�-rt��O�Ԭ�8����ke�j�$[     