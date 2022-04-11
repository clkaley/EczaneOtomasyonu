PGDMP     2                    z            EczaneSistemi    14.2    14.2 1    (           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            )           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            *           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            +           1262    24585    EczaneSistemi    DATABASE     l   CREATE DATABASE "EczaneSistemi" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "EczaneSistemi";
                postgres    false            �            1259    24654    dagitici_odeme    TABLE     o   CREATE TABLE public.dagitici_odeme (
    id integer NOT NULL,
    dagitici_id integer,
    odeme_id integer
);
 "   DROP TABLE public.dagitici_odeme;
       public         heap    postgres    false            �            1259    24653    dagitici_odeme_id_seq    SEQUENCE     �   CREATE SEQUENCE public.dagitici_odeme_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.dagitici_odeme_id_seq;
       public          postgres    false    220            ,           0    0    dagitici_odeme_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.dagitici_odeme_id_seq OWNED BY public.dagitici_odeme.id;
          public          postgres    false    219            �            1259    24622    dagiticifirma    TABLE     |  CREATE TABLE public.dagiticifirma (
    firma_id integer NOT NULL,
    firma_name character varying(250) NOT NULL,
    firma_no character varying(250) NOT NULL,
    firma_telefon character varying(250) NOT NULL,
    firma_adres character varying(250) NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
 !   DROP TABLE public.dagiticifirma;
       public         heap    postgres    false            �            1259    24621    dagiticifirma_firma_id_seq    SEQUENCE     �   CREATE SEQUENCE public.dagiticifirma_firma_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.dagiticifirma_firma_id_seq;
       public          postgres    false    216            -           0    0    dagiticifirma_firma_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.dagiticifirma_firma_id_seq OWNED BY public.dagiticifirma.firma_id;
          public          postgres    false    215            �            1259    24586    hasta    TABLE     %  CREATE TABLE public.hasta (
    hasta_id integer NOT NULL,
    hasta_name character varying(250) NOT NULL,
    hasta_tc character varying(250) NOT NULL,
    ilac_id integer,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.hasta;
       public         heap    postgres    false            �            1259    24592    hasta_hasta_id_seq    SEQUENCE     �   CREATE SEQUENCE public.hasta_hasta_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hasta_hasta_id_seq;
       public          postgres    false    209            .           0    0    hasta_hasta_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.hasta_hasta_id_seq OWNED BY public.hasta.hasta_id;
          public          postgres    false    210            �            1259    24593    ilac    TABLE     1  CREATE TABLE public.ilac (
    ilac_id integer NOT NULL,
    seri_no character varying(250) NOT NULL,
    name character varying(250) NOT NULL,
    type character varying(250) NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.ilac;
       public         heap    postgres    false            �            1259    24599    ilac_ilac_id_seq    SEQUENCE     �   CREATE SEQUENCE public.ilac_ilac_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.ilac_ilac_id_seq;
       public          postgres    false    211            /           0    0    ilac_ilac_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.ilac_ilac_id_seq OWNED BY public.ilac.ilac_id;
          public          postgres    false    212            �            1259    24632    odeme    TABLE       CREATE TABLE public.odeme (
    odeme_id integer NOT NULL,
    odeme_toplam character varying(250) NOT NULL,
    odeme_turu character varying(250) NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.odeme;
       public         heap    postgres    false            �            1259    24631    odeme_odeme_id_seq    SEQUENCE     �   CREATE SEQUENCE public.odeme_odeme_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.odeme_odeme_id_seq;
       public          postgres    false    218            0           0    0    odeme_odeme_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.odeme_odeme_id_seq OWNED BY public.odeme.odeme_id;
          public          postgres    false    217            �            1259    24612    personel    TABLE     �  CREATE TABLE public.personel (
    personel_id integer NOT NULL,
    personel_name character varying(250) NOT NULL,
    personel_tc character varying(250) NOT NULL,
    personel_telefon character varying(250) NOT NULL,
    personel_maas character varying(250) NOT NULL,
    created timestamp without time zone NOT NULL,
    updated timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.personel;
       public         heap    postgres    false            �            1259    24611    personel_personel_id_seq    SEQUENCE     �   CREATE SEQUENCE public.personel_personel_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.personel_personel_id_seq;
       public          postgres    false    214            1           0    0    personel_personel_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.personel_personel_id_seq OWNED BY public.personel.personel_id;
          public          postgres    false    213                       2604    24657    dagitici_odeme id    DEFAULT     v   ALTER TABLE ONLY public.dagitici_odeme ALTER COLUMN id SET DEFAULT nextval('public.dagitici_odeme_id_seq'::regclass);
 @   ALTER TABLE public.dagitici_odeme ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    220    219    220            {           2604    24625    dagiticifirma firma_id    DEFAULT     �   ALTER TABLE ONLY public.dagiticifirma ALTER COLUMN firma_id SET DEFAULT nextval('public.dagiticifirma_firma_id_seq'::regclass);
 E   ALTER TABLE public.dagiticifirma ALTER COLUMN firma_id DROP DEFAULT;
       public          postgres    false    215    216    216            v           2604    24600    hasta hasta_id    DEFAULT     p   ALTER TABLE ONLY public.hasta ALTER COLUMN hasta_id SET DEFAULT nextval('public.hasta_hasta_id_seq'::regclass);
 =   ALTER TABLE public.hasta ALTER COLUMN hasta_id DROP DEFAULT;
       public          postgres    false    210    209            x           2604    24601    ilac ilac_id    DEFAULT     l   ALTER TABLE ONLY public.ilac ALTER COLUMN ilac_id SET DEFAULT nextval('public.ilac_ilac_id_seq'::regclass);
 ;   ALTER TABLE public.ilac ALTER COLUMN ilac_id DROP DEFAULT;
       public          postgres    false    212    211            }           2604    24635    odeme odeme_id    DEFAULT     p   ALTER TABLE ONLY public.odeme ALTER COLUMN odeme_id SET DEFAULT nextval('public.odeme_odeme_id_seq'::regclass);
 =   ALTER TABLE public.odeme ALTER COLUMN odeme_id DROP DEFAULT;
       public          postgres    false    217    218    218            y           2604    24615    personel personel_id    DEFAULT     |   ALTER TABLE ONLY public.personel ALTER COLUMN personel_id SET DEFAULT nextval('public.personel_personel_id_seq'::regclass);
 C   ALTER TABLE public.personel ALTER COLUMN personel_id DROP DEFAULT;
       public          postgres    false    213    214    214            %          0    24654    dagitici_odeme 
   TABLE DATA           C   COPY public.dagitici_odeme (id, dagitici_id, odeme_id) FROM stdin;
    public          postgres    false    220   u9       !          0    24622    dagiticifirma 
   TABLE DATA           u   COPY public.dagiticifirma (firma_id, firma_name, firma_no, firma_telefon, firma_adres, created, updated) FROM stdin;
    public          postgres    false    216   �9                 0    24586    hasta 
   TABLE DATA           Z   COPY public.hasta (hasta_id, hasta_name, hasta_tc, ilac_id, created, updated) FROM stdin;
    public          postgres    false    209    :                 0    24593    ilac 
   TABLE DATA           N   COPY public.ilac (ilac_id, seri_no, name, type, created, updated) FROM stdin;
    public          postgres    false    211   �:       #          0    24632    odeme 
   TABLE DATA           U   COPY public.odeme (odeme_id, odeme_toplam, odeme_turu, created, updated) FROM stdin;
    public          postgres    false    218   r;                 0    24612    personel 
   TABLE DATA           ~   COPY public.personel (personel_id, personel_name, personel_tc, personel_telefon, personel_maas, created, updated) FROM stdin;
    public          postgres    false    214   �;       2           0    0    dagitici_odeme_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.dagitici_odeme_id_seq', 1, false);
          public          postgres    false    219            3           0    0    dagiticifirma_firma_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.dagiticifirma_firma_id_seq', 3, true);
          public          postgres    false    215            4           0    0    hasta_hasta_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.hasta_hasta_id_seq', 5, true);
          public          postgres    false    210            5           0    0    ilac_ilac_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.ilac_ilac_id_seq', 10, true);
          public          postgres    false    212            6           0    0    odeme_odeme_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.odeme_odeme_id_seq', 1, false);
          public          postgres    false    217            7           0    0    personel_personel_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.personel_personel_id_seq', 5, true);
          public          postgres    false    213            �           2606    24659 "   dagitici_odeme dagitici_odeme_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.dagitici_odeme
    ADD CONSTRAINT dagitici_odeme_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.dagitici_odeme DROP CONSTRAINT dagitici_odeme_pkey;
       public            postgres    false    220            �           2606    24630     dagiticifirma dagiticifirma_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.dagiticifirma
    ADD CONSTRAINT dagiticifirma_pkey PRIMARY KEY (firma_id);
 J   ALTER TABLE ONLY public.dagiticifirma DROP CONSTRAINT dagiticifirma_pkey;
       public            postgres    false    216            �           2606    24603    hasta hasta_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.hasta
    ADD CONSTRAINT hasta_pkey PRIMARY KEY (hasta_id);
 :   ALTER TABLE ONLY public.hasta DROP CONSTRAINT hasta_pkey;
       public            postgres    false    209            �           2606    24605    ilac ilac_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.ilac
    ADD CONSTRAINT ilac_pkey PRIMARY KEY (ilac_id);
 8   ALTER TABLE ONLY public.ilac DROP CONSTRAINT ilac_pkey;
       public            postgres    false    211            �           2606    24640    odeme odeme_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.odeme
    ADD CONSTRAINT odeme_pkey PRIMARY KEY (odeme_id);
 :   ALTER TABLE ONLY public.odeme DROP CONSTRAINT odeme_pkey;
       public            postgres    false    218            �           2606    24620    personel personel_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.personel
    ADD CONSTRAINT personel_pkey PRIMARY KEY (personel_id);
 @   ALTER TABLE ONLY public.personel DROP CONSTRAINT personel_pkey;
       public            postgres    false    214            �           2606    24660    dagitici_odeme dagitici_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.dagitici_odeme
    ADD CONSTRAINT dagitici_fk FOREIGN KEY (dagitici_id) REFERENCES public.dagiticifirma(firma_id);
 D   ALTER TABLE ONLY public.dagitici_odeme DROP CONSTRAINT dagitici_fk;
       public          postgres    false    3207    216    220            �           2606    24606    hasta ilac_fk    FK CONSTRAINT     p   ALTER TABLE ONLY public.hasta
    ADD CONSTRAINT ilac_fk FOREIGN KEY (ilac_id) REFERENCES public.ilac(ilac_id);
 7   ALTER TABLE ONLY public.hasta DROP CONSTRAINT ilac_fk;
       public          postgres    false    211    3203    209            �           2606    24665    dagitici_odeme odeme_fk    FK CONSTRAINT     }   ALTER TABLE ONLY public.dagitici_odeme
    ADD CONSTRAINT odeme_fk FOREIGN KEY (odeme_id) REFERENCES public.odeme(odeme_id);
 A   ALTER TABLE ONLY public.dagitici_odeme DROP CONSTRAINT odeme_fk;
       public          postgres    false    218    3209    220            %      x������ � �      !   ~   x�u�A
� ����)z��3&1qW��.c-C�AT����!�B�z?<�����vl�{ͭ@:�4H��R�5s�������zR�L�} ;�h@V�Gn�hD<\�G���ۯ3;�ϊ�qcG�o���*v         e   x�mʻ�0E�x�
��<̸: �����?lHt��+�>��G�X��FJ�MR��DS�Q��=CQ��h��8o�㗋
����I�)�E��Ow`^x�����         �   x�}�MJ1 ���)��_���z)�e7�d����@��x�Ѓ�T\3.<>�/��"��J���^��}i��02�(=��$J�䭪�uG���TO��a�#�裲<�����Q�!��S�<�{�r$g��Y8Bf�����_�Whi��ZN��ӫ=a��Ew�x�P��G����X�ʟ���U��.�ř�5�\��`�      #      x������ � �         �   x�u�K��0@��)�1�,9r�0����`'�Ё&�BO?n(])��!1�����g"ADAS2e��T���C�о����A�������Pi*JF)2���hK�F�p� ы�6O�&v��K���r��^2N�󫷶+����[C�Ԑ������S(��YK-k���d�K��ڇ�9z��	�No     