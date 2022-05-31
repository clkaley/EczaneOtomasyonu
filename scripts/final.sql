PGDMP                         z            EczaneSistemi    14.2    14.2 8    2           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            3           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            4           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            5           1262    16394    EczaneSistemi    DATABASE     l   CREATE DATABASE "EczaneSistemi" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
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
       public          postgres    false    209            6           0    0    dagiticifirma_firma_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.dagiticifirma_firma_id_seq OWNED BY public.dagiticifirma.firma_id;
          public          postgres    false    210            �            1259    16511    document    TABLE     �   CREATE TABLE public.document (
    id integer NOT NULL,
    filepath character varying(250) NOT NULL,
    filename character varying(250) NOT NULL,
    filetype character varying(250) NOT NULL
);
    DROP TABLE public.document;
       public         heap    postgres    false            �            1259    16510    document_id_seq    SEQUENCE     �   CREATE SEQUENCE public.document_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.document_id_seq;
       public          postgres    false    222            7           0    0    document_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.document_id_seq OWNED BY public.document.id;
          public          postgres    false    221            �            1259    16406    hasta    TABLE     %  CREATE TABLE public.hasta (
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
       public          postgres    false    211            8           0    0    hasta_hasta_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.hasta_hasta_id_seq OWNED BY public.hasta.hasta_id;
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
       public          postgres    false    213            9           0    0    ilac_ilac_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.ilac_ilac_id_seq OWNED BY public.ilac.ilac_id;
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
       public          postgres    false    220            :           0    0    odeme_firma_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.odeme_firma_id_seq OWNED BY public.odeme_firma.id;
          public          postgres    false    219            �            1259    16477    odeme_odeme_id_seq    SEQUENCE     �   CREATE SEQUENCE public.odeme_odeme_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.odeme_odeme_id_seq;
       public          postgres    false    218            ;           0    0    odeme_odeme_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.odeme_odeme_id_seq OWNED BY public.odeme.odeme_id;
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
       public          postgres    false    215            <           0    0    personel_personel_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.personel_personel_id_seq OWNED BY public.personel.personel_id;
          public          postgres    false    216            {           2604    16435    dagiticifirma firma_id    DEFAULT     �   ALTER TABLE ONLY public.dagiticifirma ALTER COLUMN firma_id SET DEFAULT nextval('public.dagiticifirma_firma_id_seq'::regclass);
 E   ALTER TABLE public.dagiticifirma ALTER COLUMN firma_id DROP DEFAULT;
       public          postgres    false    210    209            �           2604    16514    document id    DEFAULT     j   ALTER TABLE ONLY public.document ALTER COLUMN id SET DEFAULT nextval('public.document_id_seq'::regclass);
 :   ALTER TABLE public.document ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    221    222    222            }           2604    16436    hasta hasta_id    DEFAULT     p   ALTER TABLE ONLY public.hasta ALTER COLUMN hasta_id SET DEFAULT nextval('public.hasta_hasta_id_seq'::regclass);
 =   ALTER TABLE public.hasta ALTER COLUMN hasta_id DROP DEFAULT;
       public          postgres    false    212    211                       2604    16437    ilac ilac_id    DEFAULT     l   ALTER TABLE ONLY public.ilac ALTER COLUMN ilac_id SET DEFAULT nextval('public.ilac_ilac_id_seq'::regclass);
 ;   ALTER TABLE public.ilac ALTER COLUMN ilac_id DROP DEFAULT;
       public          postgres    false    214    213            �           2604    16481    odeme odeme_id    DEFAULT     p   ALTER TABLE ONLY public.odeme ALTER COLUMN odeme_id SET DEFAULT nextval('public.odeme_odeme_id_seq'::regclass);
 =   ALTER TABLE public.odeme ALTER COLUMN odeme_id DROP DEFAULT;
       public          postgres    false    217    218    218            �           2604    16497    odeme_firma id    DEFAULT     p   ALTER TABLE ONLY public.odeme_firma ALTER COLUMN id SET DEFAULT nextval('public.odeme_firma_id_seq'::regclass);
 =   ALTER TABLE public.odeme_firma ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    220    219    220            �           2604    16439    personel personel_id    DEFAULT     |   ALTER TABLE ONLY public.personel ALTER COLUMN personel_id SET DEFAULT nextval('public.personel_personel_id_seq'::regclass);
 C   ALTER TABLE public.personel ALTER COLUMN personel_id DROP DEFAULT;
       public          postgres    false    216    215            "          0    16399    dagiticifirma 
   TABLE DATA           u   COPY public.dagiticifirma (firma_id, firma_name, firma_no, firma_telefon, firma_adres, created, updated) FROM stdin;
    public          postgres    false    209   �@       /          0    16511    document 
   TABLE DATA           D   COPY public.document (id, filepath, filename, filetype) FROM stdin;
    public          postgres    false    222   A       $          0    16406    hasta 
   TABLE DATA           Z   COPY public.hasta (hasta_id, hasta_name, hasta_tc, ilac_id, created, updated) FROM stdin;
    public          postgres    false    211   �A       &          0    16413    ilac 
   TABLE DATA           N   COPY public.ilac (ilac_id, seri_no, name, type, created, updated) FROM stdin;
    public          postgres    false    213   �B       +          0    16478    odeme 
   TABLE DATA           U   COPY public.odeme (odeme_id, odeme_toplam, odeme_turu, created, updated) FROM stdin;
    public          postgres    false    218   SD       -          0    16494    odeme_firma 
   TABLE DATA           =   COPY public.odeme_firma (id, odeme_id, firma_id) FROM stdin;
    public          postgres    false    220   �D       (          0    16427    personel 
   TABLE DATA           ~   COPY public.personel (personel_id, personel_name, personel_tc, personel_telefon, personel_maas, created, updated) FROM stdin;
    public          postgres    false    215   ;E       =           0    0    dagiticifirma_firma_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.dagiticifirma_firma_id_seq', 5, true);
          public          postgres    false    210            >           0    0    document_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.document_id_seq', 4, true);
          public          postgres    false    221            ?           0    0    hasta_hasta_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.hasta_hasta_id_seq', 21, true);
          public          postgres    false    212            @           0    0    ilac_ilac_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.ilac_ilac_id_seq', 21, true);
          public          postgres    false    214            A           0    0    odeme_firma_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.odeme_firma_id_seq', 11, true);
          public          postgres    false    219            B           0    0    odeme_odeme_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.odeme_odeme_id_seq', 12, true);
          public          postgres    false    217            C           0    0    personel_personel_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.personel_personel_id_seq', 9, true);
          public          postgres    false    216            �           2606    16443     dagiticifirma dagiticifirma_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.dagiticifirma
    ADD CONSTRAINT dagiticifirma_pkey PRIMARY KEY (firma_id);
 J   ALTER TABLE ONLY public.dagiticifirma DROP CONSTRAINT dagiticifirma_pkey;
       public            postgres    false    209            �           2606    16518    document document_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.document
    ADD CONSTRAINT document_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.document DROP CONSTRAINT document_pkey;
       public            postgres    false    222            �           2606    16445    hasta hasta_pkey 
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
       public          postgres    false    220    209    3207            �           2606    16457    hasta ilac_fk    FK CONSTRAINT     p   ALTER TABLE ONLY public.hasta
    ADD CONSTRAINT ilac_fk FOREIGN KEY (ilac_id) REFERENCES public.ilac(ilac_id);
 7   ALTER TABLE ONLY public.hasta DROP CONSTRAINT ilac_fk;
       public          postgres    false    211    213    3211            �           2606    16500    odeme_firma odeme_fk    FK CONSTRAINT     z   ALTER TABLE ONLY public.odeme_firma
    ADD CONSTRAINT odeme_fk FOREIGN KEY (odeme_id) REFERENCES public.odeme(odeme_id);
 >   ALTER TABLE ONLY public.odeme_firma DROP CONSTRAINT odeme_fk;
       public          postgres    false    218    220    3215            "   w   x�3�t�,�M�40�4011Q�` ��M�I,�L�4202�50�52Q04�2��20�3*�.ndfd�e�P�Z�Y��ihd�&�f�G6�$�%���4�26�2��301�!nbi`����� �|%~      /   c   x����	� @�٥J�#t��\�"�	�@��u���� ^�[G�T襊xJ���X65��g�b�F�
Ev���q�I��h$��ٖlA�6�o@ 7Q2�      $   f  x����nA�㙧���gz2Kd���d%��;K����gs�ٕ��>m��j����0��������ĢV�#�w" ��!١t��\ u���\����x�������u��"[��g2v�	.=1�;k')���s����a����F�p���n1}�O˵����(�X�^<G�������+��S-b��k8�q�q�˺J�[�j�4_�"U;Ri0�=s[��q(,^�J���Ѽ�Y��4&��F��;eBS�VMVC���R�����cI%TB.*M�P|��W�����8�2����mp'�L��~����e>�$�Z_�
���t7?��-Y�"(�/��ɫj�Rr� ɱ��      &   D  x�}�Mj�0�ףS�3��%y�]��R����v���BLO�3�9Xe'i�������x#b8ED�U<7�&���/_��&m�6�ȼD�dY��(�)��a���*2���T���7W2��u4Ý`�H��YD`Wb���Cu���2�u�	Z�LsA�F��mΛ�i�=�ZPQ�)�� 4Í0)*���Ju��5���1�4�HA��:������������F
;�=zE�F9R���u�_}�U�Z\���e� 붾�o�f�T߲��̚Df��*F���"ޗn�������RL܊�Ǯ9v��.vM�|����e�;�^�j��7<+�      +   �   x�u�1�0E���@#ۉc'#k%N�	��R���qFڍB�����	"�k]�cdQF�I!*A|���gSH��L��>Sݞ�ח�
��ꍵ�Cv,�֟vh��Y���j;�]�ԓi7��@��Xr�h -��ūZ�g�	n >�`D      -   -   x�3��4�2��\f��@�9�2��F@��!�6����� �&      (   t   x�u̱�0F�Z���'��l�{ФH�PѰ۰��M�W��kt�o��J
�h}$IDw/f ��X$xQ�2�Y�����N�����?�w�-rt��O�Ԭ�8����ke�j�$[     